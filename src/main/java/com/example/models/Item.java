package com.example.models;

import com.example.uorders.MenuItemController;
import javafx.scene.control.Button;

public class Item {
    public int getId_item() {
        return Id_item;
    }

    private int Id_item;

    private String nameItem;
    private String imgItem;
    private double priceItem;
    private String detailsItem;

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getImgItem() {
        return imgItem;
    }

    public void setImgItem(String imgItem) {
        this.imgItem = imgItem;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = priceItem;
    }

    public String getDetailsItem() {
        return detailsItem;
    }

    public void setDetailsItem(String detailsItem) {
        this.detailsItem = detailsItem;
    }

    public void setId_item(int id_item) {
        Id_item = id_item;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    private int Quantity;



    }



