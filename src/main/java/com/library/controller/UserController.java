package com.library.controller;

import com.library.model.User;
import com.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    private UserService userService;
    @Autowired
    // 通过 Setter 方法注入 BookService
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    // 获取所有用户
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // 添加用户
    public void addUser(String name, String password) {
        User user = new User(null, name, password);
        userService.addUser(user);
    }

}