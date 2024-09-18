package com.library.repository;

import com.library.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    // 模拟的数据库操作
    public List<User> findAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }
}