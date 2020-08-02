package com.bookstore.GeekText.repository;

import com.bookstore.GeekText.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BooksRepository extends JpaRepository<Books, Long>, CustomBooksRepository{

    List<Books> findByGenre(String genre);
    List<Books> findTop10ByOrderBySoldCopyDesc();

}
