package com.example.demo.repositories;

import com.example.demo.models.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.Long;

public interface AuthorRepository extends JpaRepository<Authors, Long>{
}
