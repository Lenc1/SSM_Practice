package com.library;

import com.library.config.AppConfig;
import com.library.controller.BookController;
import com.library.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 加载 applicationContext.xml
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 获取 BookController Bean
        BookController bookController = (BookController) context.getBean("bookController");

        // 调用方法模拟添加和获取书籍
        bookController.addBook("Spring in Action", "Craig Walls");
        bookController.addBook("Effective Java", "Joshua Bloch");

        UserController userController = (UserController) context.getBean("userController");

        userController.addUser("admin","123456");
        userController.addUser("root","root");
        System.out.println(bookController.getAllBooks());
        System.out.println(userController.getAllUsers());
    }
}