package com.example.demo.controllers;

import com.example.demo.models.Author;
import com.example.demo.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class AuthorController {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorController (AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("login")
    public String showSignUpForm (Author author) {
        return "author/add";
    }

    @GetMapping("list-authors")
    public String showUpdateForm (Model model) {
        model.addAttribute("author", authorRepository.findAll());
        return "author/list";
    }

    @PostMapping("add")
    public String addAuthor (@Valid Author author, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "author/add";
        }
        authorRepository.save(author);
        return "redirect:author/list";
    }

    @GetMapping("edit/{id}")
    public String showUpdateForm (@PathVariable("id") long id, Model model) {
        Author author = authorRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Código de verificação número " + id + " inválido!"));
        model.addAttribute("author", author);
        return "author/update";
    }

}
