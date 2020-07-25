package com.bookstore.BookStoreDemo.repository;

import com.bookstore.BookStoreDemo.model.Books;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BooksRepository extends JpaRepository<Books, Long>{
    
    /*
    @Query("SELECT * FROM books where author = :author")
    public Optional<Books> findByAuthor(@Param("author") String author);
    */
}
