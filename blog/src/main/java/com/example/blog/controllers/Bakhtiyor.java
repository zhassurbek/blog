package com.example.blog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Bakhtiyor {

    @GetMapping("/bakhtiyor")
    public String bakhtiyor(Model model){
        return "bakhtiyor";
    }
}
