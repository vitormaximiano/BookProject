package com.example.demo.repositories;

import com.example.demo.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.Long;

public interface AuthorRepository extends JpaRepository<Author, Long>{
}
