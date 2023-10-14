package com.example.collegeproject.controller;

import com.example.collegeproject.dto.AuthenticationRequest;
import com.example.collegeproject.dto.JoinForm;
import com.example.collegeproject.dto.User;
import com.example.collegeproject.repo.UserRepository;
import com.example.collegeproject.repo.JoinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authentication")
@CrossOrigin(origins = "*")
public class AuthenticationController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JoinRepo joinRepo;

    @PostMapping("/register")
        public ResponseEntity<Boolean> register(@RequestBody AuthenticationRequest request) {
        User existingUser = userRepository.findByUsername(request.getUsername());

        if (existingUser != null) {
            return ResponseEntity.ok(false); // Username already exists
           }
        else {
            User newUser = new User();
            newUser.setUsername(request.getUsername());
            newUser.setPassword(request.getPassword());
            userRepository.save(newUser);
            return ResponseEntity.ok(true); // Registration successful
        }
    }

    @PostMapping("/signin")
    public ResponseEntity<Boolean> signin(@RequestBody AuthenticationRequest request) {
        User existingUser = userRepository.findByUsername(request.getUsername());

        if (existingUser != null && existingUser.getPassword().equals(request.getPassword())) {
            return ResponseEntity.ok(true);
        } else {
            return ResponseEntity.ok(false);
        }
    }
    @PostMapping("/joinnow")
    public ResponseEntity<Boolean> joinus(@RequestBody JoinForm joinForm) {
            JoinForm join = new JoinForm();
            join.setName(joinForm.getName());
           join.setPhone(joinForm.getPhone());
           join.setGmail(joinForm.getGmail());
         joinRepo.save(join);
            return ResponseEntity.ok(true);
        }
    }
