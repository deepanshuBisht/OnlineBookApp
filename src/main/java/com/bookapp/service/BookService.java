package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;

public interface BookService {

	void addBook(Book book);
	void updateBook(int bookId, double price) throws IdNotFoundException;
	void deleteBook(int bookId) throws IdNotFoundException;
	Book getBookById(int bookId) throws IdNotFoundException;

	List<Book> getAllBooks();
	List<Book> getBookByAuthor(String author) throws AuthorNotFoundException;
	List<Book> getBookByCategory(String category) throws CategoryNotFoundException;
}
