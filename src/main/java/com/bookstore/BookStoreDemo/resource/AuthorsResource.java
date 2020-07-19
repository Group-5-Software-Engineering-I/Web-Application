package com.bookstore.BookStoreDemo.resource;

import com.bookstore.BookStoreDemo.model.Authors;
import com.bookstore.BookStoreDemo.repository.AuthorsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rest/authors")
public class AuthorsResource {
    
    @Autowired
    AuthorsRepository authorsrepo;
    
    @GetMapping(value = "/all")
    public List<Authors> getAll() {
        return authorsrepo.findAll();
    }
    
    @PostMapping(value = "/create")
    public List<Authors> persist(@RequestBody final Authors author) {
        authorsrepo.save(author);
        return authorsrepo.findAll();
    }
}
