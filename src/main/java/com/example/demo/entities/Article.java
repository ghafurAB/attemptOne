package com.example.demo.entities;

public class Article {
    private long isbn_number;
    private String title;
    private String author;
    private String email;
    private String subject;
    private String description;
    private String detail;

    public Article() {
    }

    public long getIsbn_number() {
        return isbn_number;
    }

    public void setIsbn_number(long isbn_number) {
        this.isbn_number = isbn_number;
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
                "isbn_number=" + isbn_number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}