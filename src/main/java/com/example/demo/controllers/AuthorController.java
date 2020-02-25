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
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/", method = RequestMethod.POST)
public class AuthorController {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorController (AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/list-authors")
    public String showList (Model model) {
        List<Author> authors = authorRepository.findAll();
        if (authors != null) {
            model.addAttribute("author", authors);
        }
        return "author/list";
    }

    @GetMapping("add-author")
    public String showAddAuthor () {
        return "author/add";
    }

    @PostMapping("add-author/{id}/{name}")
    public String addAuthor (Author author, @PathVariable("id") Long id, @PathVariable("name") String name) {
        author.setId(id);
        author.setName(name);
        authorRepository.save(author);
        return "redirect:author/list";
    }

    @GetMapping("edit-author/{id}")
    public String showUpdateAuthor (@PathVariable("id") Long id, Model model) {
        Author author = authorRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Código de verificação número " + id + " inválido!"));
        model.addAttribute("author", author);
        return "author/update";
    }

    @PostMapping("edit-author/{id}")
    public String updateAuthor (@PathVariable("id") Long id, @Valid Author author, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            author.setId(id);
            return "author/update";
        }
        authorRepository.save(author);
        model.addAttribute("author", authorRepository.findAll());
        return "author/list";
    }

    @GetMapping("delete-author/{id}")
    public String deleteAuthor (@PathVariable("id") Long id, Model model) {
        Author author = authorRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Autor da id " + id + " não existe"));
        authorRepository.delete(author);
        model.addAttribute("author", authorRepository.findAll());
        return "author/delete";
    }

}
