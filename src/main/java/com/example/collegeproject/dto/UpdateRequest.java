package com.example.collegeproject.dto;

public class UpdateRequest {
    long id;
    String name;
    String phone;
    String gmail;

    public UpdateRequest(long id, String name, String phone, String gmail) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.gmail = gmail;
    }

    public long getid() {
        return id;
    }

    public void setId(long userid) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
