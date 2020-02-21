package com.example.demo.repositories;

import com.example.demo.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepository extends JpaRepository<Autor, Long>{
}
