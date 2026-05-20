package com.trivia.triviaapp.service;

import com.trivia.triviaapp.model.User;
import com.trivia.triviaapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    public User register(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    public User login(String username,String password){

        User user=userRepository.findByUserName(username);
        if(user == null){
            return null;
        }
        if(passwordEncoder.matches(password,user.getPassword())){
            return user;
        }
        return null;
    }
}
