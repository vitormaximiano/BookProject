package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.Set;

@Entity
public class AuthorsBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private Set<Authors> authors;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private Set<Books> books;

    public Long getId (){
        return id;
    }

    public void setId (Long id){
        this.id = id;
    }

    public Set<Authors> getAuthors (){
        return authors;
    }

    public void setAuthors (Set<Authors> authors){
        this.authors = authors;
    }

    public Set<Books> getBooks (){
        return books;
    }

    public void setBooks (Set<Books> books){
        this.books = books;
    }
}
