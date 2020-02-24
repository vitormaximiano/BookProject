package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String index () {
        return "redirect:list-authors";
    }

    @RequestMapping("bootstrap")
    public String bootstrap () {
        return "css/bootstrap.min";
    }

}
