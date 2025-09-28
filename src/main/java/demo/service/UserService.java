package com.example.demo.services;


import com.example.demo.entity.User;

public interface UserService {
    User register(User user);
    User login(String username, String password);
}
