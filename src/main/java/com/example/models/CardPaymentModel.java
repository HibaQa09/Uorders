package com.example.models;

import java.time.LocalDate;

public class CardPaymentModel {


  private String name;
    private  String CardNumber;
    private LocalDate ExpDate;
    private  String Cvc;
    private  String Label;
    public CardPaymentModel(){
        super();
    }



    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public LocalDate getExpDate() {
        return ExpDate;
    }

    public void setExpDate(LocalDate expDate) {
        ExpDate = expDate;
    }

    public String getCvc() {
        return Cvc;
    }

    public void setCvc(String cvc) {
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
