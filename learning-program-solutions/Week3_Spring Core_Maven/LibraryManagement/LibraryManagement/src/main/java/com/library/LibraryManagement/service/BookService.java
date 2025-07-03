package com.library.LibraryManagement.service;

import com.library.LibraryManagement.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor Injection used.");
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection used.");
    }

    public void addBook(String bookName) {
        System.out.println(bookName + " book added.");
    }
}
