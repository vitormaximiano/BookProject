package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "isbn", nullable = false, unique = true)
    private String isbn;

    @Column(name = "description", nullable = false)
    private String description;

    public void setId (long id){
        this.id = id;
    }
}
