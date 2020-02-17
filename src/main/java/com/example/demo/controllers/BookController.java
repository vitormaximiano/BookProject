package com.example.demo.controllers;

import com.example.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;

public class BookController{

    @Autowired
    private BookService service;

}
