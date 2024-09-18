package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    // 通过 Setter 方法注入 BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // 获取所有书籍
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // 添加书籍
    public void addBook(Book book) {
        bookRepository.save(book);
    }
}