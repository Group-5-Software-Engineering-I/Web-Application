package com.bookstore.BookStoreDemo.resource;

import com.bookstore.BookStoreDemo.model.Books;
import com.bookstore.BookStoreDemo.repository.BooksRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rest/books")
public class BooksResource {
    
    @Autowired
    BooksRepository booksrepo;
    
    @GetMapping(value = "/all")
    public List<Books> getAll() {
        return booksrepo.findAll();
    }
    
    /*
    @GetMapping(value = "/{isbn}")
    public Optional<Books> getById(@PathVariable Long isbn) {
        return booksrepo.findById(isbn);
    }
    
   
    @GetMapping(value = "/{author}")
    public Optional<Books> getByAuthor(@PathVariable String author) {
        return booksrepo.findByAuthor(author);
    }
    */
    
    @PostMapping(value = "/create")
    public List<Books> persist(@RequestBody final Books book) {
        booksrepo.save(book);
        return booksrepo.findAll();
    }
    
    /*
    @PutMapping(value = "/update/{isbn}")
    public void update(@PathVariable Long isbn) {
        
    }
    
    @DeleteMapping(value = "/delete/{isbn}")
    public void delete(@PathVariable Long isbn) {
 
    }
    */
}
