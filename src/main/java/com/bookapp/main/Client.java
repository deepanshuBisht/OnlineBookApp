package com.bookapp.main;

import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		BookService service = new BookServiceImpl();
		service.getAllBooks().forEach(System.out::println);
//		System.out.println("**********************************");
//		try {
//			System.out.println(service.getBookById(11));
//		} catch (IdNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("**********************************");
//		try {
//			service.getBookByAuthor("Mansi").forEach(System.out::println);
//		} catch (AuthorNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("**********************************");
//		try {
//			service.getBookByCategory("Tech").forEach(System.out::println);
//		} catch (CategoryNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
	}

}
