package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "isbn", nullable = false, unique = true)
    private String isbn;

    @Column(name = "description", nullable = false)
    private String description;

    public Long getId (){
        return id;
    }

    public void setId (Long id){
        this.id = id;
    }

    public String getTitle (){
        return title;
    }

    public void setTitle (String title){
        this.title = title;
    }

    public String getIsbn (){
        return isbn;
    }

    public void setIsbn (String isbn){
        this.isbn = isbn;
    }

    public String getDescription (){
        return description;
    }

    public void setDescription (String description){
        this.description = description;
    }

}
