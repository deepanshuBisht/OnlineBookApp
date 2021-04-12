package com.bookapp.dao;

import java.util.List;

import com.bookapp.model.Book;

public interface BookDAO {

	void addOneBook(Book book);
	int updateOneBook(int bookId, double price);
	int deleteOneBook(int bookId);
	Book findBookById(int bookId);

	List<Book> findAllBooks();
	List<Book> findBookByAuthor(String author);
	List<Book> findBookByCategory(String category);

}
