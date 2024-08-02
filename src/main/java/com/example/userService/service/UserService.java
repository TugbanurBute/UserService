package com.example.userService.service;

import com.example.userService.entity.User;
import com.example.userService.repository.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

}
