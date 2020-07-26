package com.bookstore.BookStoreDemo.repository;

import com.bookstore.BookStoreDemo.model.Books;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface BooksRepository extends JpaRepository<Books, Long>{
    
    List<Books> findByAuthor(String author);
    
}
