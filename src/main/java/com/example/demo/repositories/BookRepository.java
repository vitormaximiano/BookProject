package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Long> {
}
