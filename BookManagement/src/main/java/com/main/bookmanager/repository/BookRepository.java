package com.main.bookmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.bookmanager.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
}
