package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.Set;

@Entity
public class AuthorBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private Set<Author> author;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private Set<Book> book;

    public Long getId (){
        return id;
    }

    public void setId (Long id){
        this.id = id;
    }

    public Set<Author> getAuthor (){
        return author;
    }

    public void setAuthor (Set<Author> author){
        this.author = author;
    }

    public Set<Book> getBook (){
        return book;
    }

    public void setBook (Set<Book> book){
        this.book = book;
    }

}
