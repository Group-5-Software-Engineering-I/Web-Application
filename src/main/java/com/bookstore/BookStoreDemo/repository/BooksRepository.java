package com.bookstore.BookStoreDemo.repository;

import com.bookstore.BookStoreDemo.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Long>{
    
}
