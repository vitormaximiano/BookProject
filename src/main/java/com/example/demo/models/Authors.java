package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Authors {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name="name", nullable=false)
    private String name;

    public void setId (long id){
        this.id = id;
    }

    public long getId (){
        return id;
    }

    public String getName (){
        return name;
    }
}
