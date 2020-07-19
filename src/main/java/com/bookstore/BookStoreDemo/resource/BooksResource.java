package com.bookstore.BookStoreDemo.resource;

import com.bookstore.BookStoreDemo.model.Books;
import com.bookstore.BookStoreDemo.repository.BooksRepository;
import java.util.List;
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
    
    @GetMapping(value = "/{isbn}")
    public Books getByISBN(Long isbn) {
        return booksrepo.findOne(isbn);
    }
    
    @PostMapping(value = "/create")
    public List<Books> persist(@RequestBody final Books book) {
        booksrepo.save(book);
        return booksrepo.findAll();
    }
}
