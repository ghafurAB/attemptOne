package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ArticleController {

    /*
    these following operations are mapped in this controller
    Create @PostMapping
    Read   @GetMapping
    Update @PostMapping
    Delete @DeleteMapping
     */
    @GetMapping("/home")

    public String homepage(){
        return "Welcome back to the main backend page here";
    }

}
