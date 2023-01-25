package com.example.models;

import java.time.LocalDate;

public class CardPaymentModel {


  private String name;
    private  int CardNumber;
    private LocalDate ExpDate;
    private  int Cvc;
    private  String Label;
    private CardPaymentModel(){
        super();
    }



    public int getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(int cardNumber) {
        CardNumber = cardNumber;
    }

    public LocalDate getExpDate() {
        return ExpDate;
    }

    public void setExpDate(LocalDate expDate) {
        ExpDate = expDate;
    }

    public int getCvc() {
        return Cvc;
    }

    public void setCvc(int cvc) {
        Cvc = cvc;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
