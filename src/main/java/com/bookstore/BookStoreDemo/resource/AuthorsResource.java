package com.bookstore.BookStoreDemo.resource;

import com.bookstore.BookStoreDemo.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/authors")
public class AuthorsResource {
    
    @Autowired
    AuthorsRepository authorsrepo;
    
}
