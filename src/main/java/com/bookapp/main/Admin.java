package com.bookapp.main;

import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class Admin {

	public static void main(String[] args) {
		Book book = new Book("Java",15,"Deepu","Tech",250.0);
		BookService service = new BookServiceImpl();
		service.addBook(book);
//		System.out.println("****************************");
//		try {
//			service.deleteBook(10);
//		} catch (IdNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("****************************");
//		try {
//			service.updateBook(10, 900);
//		} catch (IdNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
//		
	}

}
