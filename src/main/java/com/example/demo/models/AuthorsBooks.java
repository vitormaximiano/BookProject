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
    private long id;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private Set<Authors> authors;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private Set<Books> books;

}
