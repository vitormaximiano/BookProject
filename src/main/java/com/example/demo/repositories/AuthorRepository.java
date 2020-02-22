package com.example.demo.repositories;

import com.example.demo.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.Long;

public interface AuthorRepository extends JpaRepository<Book, Long>{
}
