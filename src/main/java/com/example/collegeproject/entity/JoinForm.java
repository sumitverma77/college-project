package com.example.collegeproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JoinForm {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
//    private String username;
    private String gmail;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  long getid()
    {
        return id;
    }
    public  void setid(long id)
    {
        this.id=id;
    }

//    public String getUsername() {
//        return username;
//    }

//    public void setUsername(String username) {
//        this.username = username;
//    }

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

    public JoinForm() {
    }

    public JoinForm(long id , String name, String gmail, String phone) {
         this.id=id;
        this.name = name;
//        this.username = username;
        this.gmail = gmail;
        this.phone = phone;
    }
}
