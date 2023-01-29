package com.example.models;

public class ChangePswdModel {

    private String Email;
    private String npassword;
    private String cpassword;

    public String getcpassword(){
        return cpassword;
    }

    public String getnassword() {
        return npassword;
    }

    public void setcpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public void setnpassword(String npassword) {
        this.npassword = npassword;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
