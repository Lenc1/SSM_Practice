package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    // 使用 @Autowired 自动注入
    @Autowired
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