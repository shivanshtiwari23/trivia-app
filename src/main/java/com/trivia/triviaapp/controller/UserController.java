package com.trivia.triviaapp.controller;

import com.trivia.triviaapp.model.User;
import com.trivia.triviaapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User loggedInUser = userService.login(user.getUserName(), user.getPassword());
        if (loggedInUser != null) {
            return "Login Successful";
        } else {
            return "Invalid username or password";
        }
    }
    @PostMapping("/register")
    public String register(@RequestBody User user){
        System.out.println("Username: " + user.getUserName());
        System.out.println("Password: " + user.getPassword());
        userService.register(user);
        return "User registered successfully";
    }
}
