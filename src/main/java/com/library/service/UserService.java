package com.library.service;

        import com.library.model.User;
        import com.library.repository.UserRepository;

        import java.util.List;

public class UserService {
    private UserRepository userRepository;
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 获取所有用户
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // 添加用户
    public void addUser(User user) {
        userRepository.save(user);
    }
}