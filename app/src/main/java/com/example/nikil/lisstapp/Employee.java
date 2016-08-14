package com.example.nikil.lisstapp;

/**
 * Created by Nikil on 8/9/2016.
 */
public class Employee {
    private String name;
    private String position;
    private String address;
    private String email;

    public Employee(String name, String position, String address, String email) {
        this.name = name;
        this.position = position;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
