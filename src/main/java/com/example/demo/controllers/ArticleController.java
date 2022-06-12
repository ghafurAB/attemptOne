package com.example.demo.controllers;

import com.example.demo.entities.Article;
import com.example.demo.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
// to add a prefix(rest) to all URLs I used request mapping
@RequestMapping("/rest/articles")

public class ArticleController {

    /*
    these following operations are mapped in this controller
    Create @PostMapping
    Read   @GetMapping
    Update @PostMapping
    Delete @DeleteMapping
     */
    @Autowired
    private ArticleService articleService;

    @GetMapping("")
    public List<Article> getAll(){
        return articleService.getAll();
    }
    @GetMapping("/{id}")
            public  Article getById( Long id)
    {
        return articleService.findById(id);
    }

    @GetMapping("/isbn/{isbnNumber}")
    public List<Article> findByIsbnNumber(@PathVariable  Long isbnNumber) {
        return articleService.findAllByIsbnNumber(isbnNumber);
    }
    @GetMapping("/subject/{subject}")
        public  List<Article> findBySubject( @PathVariable  String subject){
        return articleService.findAllBySubject(subject);
    }
    @PostMapping("/edit/{id}")
        public Optional<Article> editArticle(@PathVariable Long id, @RequestBody Article editedArticle){
            return articleService.editArticleById(id, editedArticle);
        }
    @PostMapping("")
    public Article save(@RequestBody Article article) {
        return articleService.save(article);
    }
    @DeleteMapping("/article/{id}")
    public void deleteArticleById(@PathVariable Long id){
         articleService.deleteArticleById(id);
    }
}
