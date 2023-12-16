package org.example.models;

import static org.example.utils.RandomStringGenerator.generateRandomString;

public class User {
    private int userId;
    private String email;
    private String name;
    private String phoneNumber;

    public User(int userId,String email, String name, String phoneNumber) {
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.userId = userId;
    }

    public String getUserName(){
        return name;
    }

    public String setUserName(){
        return this.name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
