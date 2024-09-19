package com.library.repository;

import com.library.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
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