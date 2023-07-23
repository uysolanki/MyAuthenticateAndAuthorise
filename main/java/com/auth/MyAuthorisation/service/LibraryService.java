package com.auth.MyAuthorisation.service;

import java.util.List;

import com.auth.MyAuthorisation.model.Book;

public interface LibraryService {
	public List<Book> findAll();

	public Book findById(int theId);

	public void save(Book theBook);

	public void deleteById(int theId);

	public List<Book> searchBy(String name, String author);


}
