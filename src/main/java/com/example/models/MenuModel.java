package com.example.models;

public class MenuModel {
    private int Id_Category;
    private String Category;

    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getId_Category() {
        return Id_Category;
    }

    public void setId_Category(int id_Category) {
        Id_Category = id_Category;
    }

    public MenuModel(int idCategory , String Cat , String img_cat) {
        Id_Category = idCategory;
        Category =Cat;
        img = img_cat;

    }
}
