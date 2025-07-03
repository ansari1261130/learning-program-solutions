package com.library.LibraryManagement;

import com.library.LibraryManagement.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LibraryManagementApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LibraryManagementApplication.class, args);
		var bookService = context.getBean(BookService.class);
		bookService.addBook("Java");
		bookService.addBook("Spring");
	}

}
