package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.*;

@Entity
@Table(name = "tb_user")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy= AUTO)
    private Long id;

    @Column(name="title", nullable=false)
    private String title;

    @Column(name="isbn", nullable=false)
    private String isbn;

    @Column(name="autor", nullable=false)
    private String autor;

    @Column(name="description", nullable=false)
    private String description;

    public Long getId (){
        return id;
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

    public String getAutor (){
        return autor;
    }

    public void setAutor (String autor){
        this.autor = autor;
    }

    public String getDescription (){
        return description;
    }

    public void setDescription (String description){
        this.description = description;
    }

}
