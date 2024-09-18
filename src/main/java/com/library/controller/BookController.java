package com.library.controller;

import com.library.model.Book;
import com.library.service.BookService;

import java.util.List;

public class BookController {
    private BookService bookService;

    // 通过 Setter 方法注入 BookService
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    // 获取所有书籍
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // 添加书籍
    public void addBook(String title, String author) {
        Book book = new Book(null, title, author);
        bookService.addBook(book);
    }
}