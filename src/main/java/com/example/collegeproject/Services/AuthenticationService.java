package com.example.collegeproject.services;

import com.example.collegeproject.dto.AuthenticationRequest;
import com.example.collegeproject.dto.JoinForm;
import com.example.collegeproject.dto.User;
import com.example.collegeproject.repo.UserRepository;
//import com.example.collegeproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;


    public boolean registerUser(AuthenticationRequest request) {
        User existingUser = userRepository.findByUsername(request.getUsername());
        if (existingUser != null) {
            return false; // Username already exists
        } else {
            User newUser = new User();
            newUser.setUsername(request.getUsername());
            newUser.setPassword(request.getPassword());
            userRepository.save(newUser);
            return true; // Registration successful
        }
    }

    public boolean signinUser(AuthenticationRequest request) {
        User existingUser = userRepository.findByUsername(request.getUsername());
        if (existingUser != null && existingUser.getPassword().equals(request.getPassword())) {
            return true;
        } else {
            return false;
        }
    }
}

