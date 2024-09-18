package com.library.repository;

import com.library.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    // 模拟的数据库操作
    public List<Book> findAll() {
        return books;
    }

    public void save(Book book) {
        books.add(book);
    }
}