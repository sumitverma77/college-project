package com.example.collegeproject.controller;
import com.example.collegeproject.dto.AuthenticationDetails;
import com.example.collegeproject.services.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/authentication")
public class AuthenticationController {
//    @CrossOrigin(origins = "http://127.0.0.1:3000")
    @PostMapping("/register")
    public Boolean register(@RequestBody AuthenticationDetails request)
    {
        return Authentication.register(request);
    }
//    @CrossOrigin(origins = "*")
    @GetMapping("/signin")
    public Boolean signin(@RequestParam("username") String username,@RequestParam("password") String password)
    {
        return Authentication.signin(username,password);
    }
}
