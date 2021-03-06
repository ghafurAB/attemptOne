package com.example.demo.entities;
import javax.persistence.*;

@Entity
@Table(name="articles")
public class Article {
    // Id is the primary key here
    @Id
    // auto incrementing the id by GenerationType.IDENTITY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long isbnNumber;
    private String title;
    private String author;
    private String email;
    private String subject;
    private String description;
    private String detail;

    public Article() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(long isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
// to string method
    @Override
    public String toString() {
        return "\nArticle{" +
                "isbn_number=" + isbnNumber +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}