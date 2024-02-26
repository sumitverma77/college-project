package com.example.collegeproject;

import com.example.collegeproject.dto.JoinRequest;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class CollegeProjectApplication {

    public static void main(String[] args) {
   SpringApplication.run(CollegeProjectApplication.class, args);
// context.getBean(JoinRequest.class);
//        System.out.println(JoinRequest.name());
    }

}
