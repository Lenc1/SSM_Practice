package com.library.controller;

import com.library.model.Book;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {
    private BookService bookService;

    // 使用 @Autowired 自动注入
    @Autowired
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