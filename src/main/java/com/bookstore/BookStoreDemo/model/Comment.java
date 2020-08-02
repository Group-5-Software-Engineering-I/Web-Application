
package com.bookstore.BookStoreDemo.model;

import com.bookstore.BookStoreDemo.model.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Comments")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentId", nullable = false, unique = true)
    private int commentId;

//    @Column(name = "comment_createdDate")
//    private LocalDateTime createdDate = LocalDateTime.now();
    @Column(name = "comment_createdDate")
    private String createdDate;

    @Column(name = "comment_text")
    private String text;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "userId", referencedColumnName = "username", nullable = false)
    @JsonIgnore
    private Users user;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "bookId", referencedColumnName = "isbn", nullable = false)
    @JsonIgnore
    private Books book;

    //For Deserialization
    public Comment() {}

    public Comment(Users user, int commentId, String CreatedDate, String text, Books book) {
        this.user = user;
        this.commentId = commentId;
        this.createdDate = CreatedDate;
        this.text = text;
        this.book = book;
    }

    public int getCommentId() {
        return commentId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getText() {
        return text;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }
}
