package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Set;

@Entity
public class BookAuthor {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private Set<Book> book;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private Set<Author> author;

}
