package com.example.demo.repositories;

import com.example.demo.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.Long;

public interface BookRepository extends JpaRepository<Book, Long>{
}
