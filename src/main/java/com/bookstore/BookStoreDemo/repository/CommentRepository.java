
package com.bookstore.BookStoreDemo.repository;



import com.bookstore.BookStoreDemo.model.Books;
import com.bookstore.BookStoreDemo.model.Comment;
import com.bookstore.BookStoreDemo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findByUser(Users user);

    Optional <Comment> findCommentByBook(Long BookId);

    List<Comment> findByBook(Books BookId);

    //Optional <Comment> findByBook(Long id);
}


/*
package com.example.FPtest.repository;


import com.example.FPtest.model.Book;
import com.example.FPtest.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, String> {

    Optional <Comment> findCommentByUser(String username);

    Optional <Comment> findCommentByBook(Long book_id);

    List<Comment> findByBook(Long book_id);

    //Optional <Comment> findByBook(Long id);
}

 */



