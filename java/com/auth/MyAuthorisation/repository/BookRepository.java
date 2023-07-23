package com.auth.MyAuthorisation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.MyAuthorisation.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	
	List<Book> findByNameContainsAndAuthorContainsAllIgnoreCase(String name,String author);
	
}
