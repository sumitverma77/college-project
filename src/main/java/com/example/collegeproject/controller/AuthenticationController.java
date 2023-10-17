package com.example.collegeproject.controller;

import com.example.collegeproject.dto.AuthenticationRequest;
import com.example.collegeproject.dto.JoinRequest;
import com.example.collegeproject.dto.UpdateRequest;
import com.example.collegeproject.dto.responcedto.RegistrationResponse;
import com.example.collegeproject.entity.JoinForm;
import com.example.collegeproject.repo.JoinRepo;
import com.example.collegeproject.services.AuthenticationService;
import com.example.collegeproject.services.JoinService;
import com.example.collegeproject.services.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authentication")
@CrossOrigin(origins = "*")
public class AuthenticationController {


//   @Autowired
//    private JoinRepo joinRepo;


    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private JoinService joinservice;
  @Autowired
  private UpdateService updateService;
    @PostMapping("/register")
    public ResponseEntity<RegistrationResponse> register(@RequestBody AuthenticationRequest request) {
        RegistrationResponse rgistrationResponse  = authenticationService.registerUser(request);
        return ResponseEntity.ok(rgistrationResponse);
    }

    @PostMapping("/signin")
    public ResponseEntity<RegistrationResponse> signin(@RequestBody AuthenticationRequest request) {
        RegistrationResponse registrationResponse = authenticationService.signinUser(request);
        return ResponseEntity.ok(registrationResponse);
    }

    @PostMapping("/joinnow")
    public ResponseEntity<RegistrationResponse> join(@RequestBody JoinRequest request) {

            RegistrationResponse registrationResponse = joinservice.join(request);
            return ResponseEntity.ok(registrationResponse);


    }
    @PutMapping("/update")
    public ResponseEntity<RegistrationResponse> update(@RequestBody UpdateRequest updateRequest)
    {
        RegistrationResponse registrationResponse=updateService.update(updateRequest);
        return ResponseEntity.ok(registrationResponse);
    }


}
