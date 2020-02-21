package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name="title", nullable=false)
    private String title;

    @Column(name="isbn", nullable=false, unique=true)
    private String isbn;

    @Column(name="description", nullable=true)
    private String description;

    public long getId (){
        return id;
    }

    public void setId (long id){
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
