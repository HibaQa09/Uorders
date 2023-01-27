package com.example.models;

public class registerModel {

    private int id;
    private String firstName;
    private String LastName;
    private String email;
    private String passwrd;
    private String passwrdConfirmation;


    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return LastName;
    }

    public void setLastName(String LastName) {

        this.LastName = LastName;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPasswrd() {

        return passwrd;
    }

    public void setPasswrd(String passwrd) {

        this.passwrd = passwrd;
    }

    public String getPasswrdConfirmation() {

        return passwrdConfirmation;
    }

    public void setPasswrdConfirmation(String passwrdConfirmation) {

        this.passwrdConfirmation = passwrdConfirmation;
    }

}
