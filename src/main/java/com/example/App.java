package com.example;

import com.example.service.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorldService helloWorldService = (HelloWorldService) context.getBean("helloWorld");
        helloWorldService.printMessage();
    }
}