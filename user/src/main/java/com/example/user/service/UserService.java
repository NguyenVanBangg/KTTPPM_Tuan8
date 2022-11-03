package com.example.user.service;

import java.util.List;

import com.example.user.entity.User;

public interface UserService {
    public List<User> getAll();
    public User save(User user);
}
