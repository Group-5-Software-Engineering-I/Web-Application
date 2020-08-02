package com.bookstore.GeekText.repository;

import com.bookstore.GeekText.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomBooksRepository {
    


    List<Books> findOrderedByPriceLimitedTo(int limit);
}
