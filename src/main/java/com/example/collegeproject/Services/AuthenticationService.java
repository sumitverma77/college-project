package com.example.collegeproject.services;

import com.example.collegeproject.dto.AuthenticationRequest;
import com.example.collegeproject.dto.responcedto.RegistrationResponse;
import com.example.collegeproject.entity.User;
import com.example.collegeproject.repo.UserRepository;
//import com.example.collegeproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;


        public RegistrationResponse registerUser(AuthenticationRequest request) {
          User existingUser = userRepository.findByUsername(request.getUsername());
            RegistrationResponse response = new RegistrationResponse();
            if (existingUser != null) {
                response.setUserId(null);
                response.setMessage("user name not available");
            }
            else {
                User newUser = new User();
                newUser.setUsername(request.getUsername());
                newUser.setPassword(request.getPassword());
                newUser=  userRepository.save(newUser);
                response.setUserId(newUser.getId());
                response.setMessage("Registration Successfull");
            }
            return response;
       }

    public RegistrationResponse signinUser(AuthenticationRequest request) {
        User existingUser = userRepository.findByUsername(request.getUsername());
        RegistrationResponse registrationResponse= new RegistrationResponse();
        if (existingUser != null && existingUser.getPassword().equals(request.getPassword())) {

            registrationResponse.setUserId(existingUser.getId());
            registrationResponse.setMessage("signin  succesfull");
        } else {
            registrationResponse.setUserId(null);
            registrationResponse.setMessage("wrong username or password ");
        }
        return registrationResponse;
    }
}

