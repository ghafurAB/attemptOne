package com.example.demo.services;

import com.example.demo.entities.Article;
import com.example.demo.repositories.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepo articleRepo;

    // method for finding all articles
    public List<Article> getAll() {
        return articleRepo.findAll();
    }

    public Article save(Article article) {
        return articleRepo.save(article);
    }

    public Article findById(Long id) {
        if (articleRepo.findById(id).isPresent()) {
            return articleRepo.findById(id).get();
        }
    return null;
    }


    public List<Article> findAllBySubject(String subject) {
        return articleRepo.findAllBySubject(subject);
    }

    public List<Article> findAllByIsbnNumber(Long isbnNumber) {
        return articleRepo.findAllByIsbnNumber(isbnNumber);
    }

    public Optional<Article> editArticleById(Long id, Article editedArticle) {
        return articleRepo.findById(id)
                .map(article -> {
            article.setIsbnNumber(editedArticle.getIsbnNumber());
            article.setAuthor(editedArticle.getAuthor());
            article.setDescription(editedArticle.getDescription());
            article.setDetail(editedArticle.getDetail());
            article.setEmail(editedArticle.getEmail());
            article.setSubject(editedArticle.getSubject());
            article.setTitle(editedArticle.getTitle());
            return articleRepo.save( article);
        });
    }
    public void deleteArticleById(Long id){
         articleRepo.deleteById(id);
    }
}