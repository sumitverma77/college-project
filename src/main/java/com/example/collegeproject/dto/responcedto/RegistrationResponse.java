package com.example.collegeproject.dto.responcedto;

public class RegistrationResponse {
    private Long userId;
    private String message;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public RegistrationResponse(Long userId, String message) {
        this.userId = userId;
        this.message = message;
    }

    public RegistrationResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
