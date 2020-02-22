package com.example.demo.controllers;

import com.example.demo.models.Author;
import com.example.demo.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class AuthorController {

    AuthorRepository authorRepository;

    @GetMapping("/")
    public String listAutors (@Valid Author author, BindingResult bindingResult, Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "author/list";
    }

    @GetMapping("/add-author")
    public String login (@Valid Author author, BindingResult bindingResult, Model model) {
        return "author/add";
    }



}
