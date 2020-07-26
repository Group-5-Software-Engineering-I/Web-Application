package com.bookstore.BookStoreDemo.resource;

import com.bookstore.BookStoreDemo.model.Books;
import com.bookstore.BookStoreDemo.repository.BooksRepository;
import exceptions.NotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/greektext/books")
public class BooksResource {
    
    @Autowired
    BooksRepository booksrepo;
    
    @GetMapping("/all")
    public List<Books> getAll() {
        return booksrepo.findAll();
    }
    
    @GetMapping("/isbn/{isbn}")
    public Books getById(@PathVariable Long isbn) {
        return booksrepo.findById(isbn).orElseThrow(() -> new NotFoundException("Book with ISBN " + isbn + " is not found!"));
    }
    
    @GetMapping(value = "/author/{author}")
    public List<Books> getByAuthor(@PathVariable String author) {
        return booksrepo.findByAuthor(author);
    }
  
    @PostMapping(value = "/create")
    public List<Books> persist(@RequestBody final Books book) {
        booksrepo.save(book);
        return booksrepo.findAll();
    }
    
    @PutMapping(value = "/update")
    public String update(@RequestBody final Books book) {
        booksrepo.save(book);
        return "Book with ISBN " + book.getIsbn() + " is updated!";
    }
    
    @DeleteMapping(value = "/delete/{isbn}")
    public String delete(@PathVariable Long isbn) {
        Optional<Books> book = booksrepo.findById(isbn);
        if(book.isPresent()) {
            booksrepo.delete(book.get());
            return "Book with ISBN " + isbn + " is deleted!";
        }
        else {
            throw new NotFoundException("Book with ISBN " + isbn + " does not exist!");
        }
    }
}
