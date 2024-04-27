/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fariznetwork.studentregistration.data;

import java.util.UUID;

public class User {

//    All args constructor
    public User(UUID userId, String name, String email, String username, String password, String gender, String address, String phone) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

//    No args const
    public User() {
    }
    
    private UUID userId;
    private String name;
    private String email;
    private String username;
    private String password;
    private String gender;
    private String address;
    private String phone;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", name=" + name + ", email=" + email + ", username=" + username + ", password=" + password + ", gender=" + gender + ", address=" + address + ", phone=" + phone + '}';
    }
    
    
    
}
