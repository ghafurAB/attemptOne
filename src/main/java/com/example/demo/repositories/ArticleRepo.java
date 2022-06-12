package com.example.demo.repositories;

import com.example.demo.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Long> {
    List<Article> findAllBySubject(String subject);
    List<Article> findAllByIsbnNumber(Long isbnNumber);

}
