package com.example.models;

public class registerModule {

    private char firstName;
    private char secondName;
    private char email;
    private char passwrd;
    private char passwrdConfirmation;
    private int Chamber;

    public char getFirstName() {
        return firstName;
    }

    public void setFirstName(char firstName) {
        this.firstName = firstName;
    }

    public char getSecondName() {
        return secondName;
    }

    public void setSecondName(char secondName) {
        this.secondName = secondName;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(char passwrd) {
        this.passwrd = passwrd;
    }

    public char getPasswrdConfirmation() {
        return passwrdConfirmation;
    }

    public void setPasswrdConfirmation(char passwrdConfirmation) {
        this.passwrdConfirmation = passwrdConfirmation;
    }

    public int getChamber() {
        return Chamber;
    }

    public void setChamber(int chamber) {
        Chamber = chamber;
    }

    public void register(){
        //add to DB
    }
}
