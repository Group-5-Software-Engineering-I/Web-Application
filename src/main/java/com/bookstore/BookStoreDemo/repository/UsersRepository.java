package com.bookstore.BookStoreDemo.repository;

import com.bookstore.BookStoreDemo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
