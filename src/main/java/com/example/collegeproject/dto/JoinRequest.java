package com.example.collegeproject.dto;

import org.springframework.stereotype.Component;

public class JoinRequest {
    private long id;
    private String name;
//    private String username;
    private String gmail;
    private String phone;

    public JoinRequest(String name, long id, String gmail, String phone) {
        this.name = name;
        this.id = id;
        this.gmail = gmail;
        this.phone = phone;
    }
 public  String name()
 {
     return "sumit";
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getid() {
        return id;
    }

    public void setUsername(Long id) {
        this.id = id;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
