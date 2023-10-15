package com.example.collegeproject.controller;

import com.example.collegeproject.dto.AuthenticationRequest;
import com.example.collegeproject.dto.JoinForm;
import com.example.collegeproject.dto.User;
import com.example.collegeproject.repo.UserRepository;
import com.example.collegeproject.repo.JoinRepo;
import com.example.collegeproject.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authentication")
@CrossOrigin(origins = "*")
public class AuthenticationController {

    @Autowired
    private JoinRepo joinRepo;
    @Autowired
    private AuthenticationService authenticationService;
       @PostMapping("/register")
    public ResponseEntity<Boolean> register(@RequestBody AuthenticationRequest request) {
        boolean registrationResult = authenticationService.registerUser(request);
        return ResponseEntity.ok(registrationResult);
    }
    @PostMapping("/signin")
    public ResponseEntity<Boolean> signin(@RequestBody AuthenticationRequest request) {
        boolean signinResult = authenticationService.signinUser(request);
        return ResponseEntity.ok(signinResult);
    }
    @PostMapping("/joinnow")
    public ResponseEntity<Boolean> joinus(@RequestBody JoinForm joinform) {
        JoinForm existingUsername = joinRepo.findByUsername(joinform.getUsername());
        if(existingUsername!=null)
        {
            return ResponseEntity.ok(false);
        }
            JoinForm join = new JoinForm();
            join.setName(joinform.getName());
           join.setPhone(joinform.getPhone());
           join.setGmail(joinform.getGmail());
           join.setUsername(joinform.getUsername());
         joinRepo.save(join);
            return ResponseEntity.ok(true);
        }
    }
