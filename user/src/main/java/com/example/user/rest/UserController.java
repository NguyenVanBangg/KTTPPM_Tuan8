package com.example.user.rest;

import com.example.user.entity.User;
import com.example.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping("/user")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }
}
