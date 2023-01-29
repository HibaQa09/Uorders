package com.example.models;

public class MyinfoModel {

    private String name;

    private Double idcard;

    private String Email;


    public Double getIdcard() {
        return idcard;
    }

    public void setIdcard(Double idcard) {
        this.idcard = idcard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }
}
