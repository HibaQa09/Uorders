package com.example.Database;

import com.example.models.CategoryModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MenuCatDB {

    private static List<CategoryModel> category = new ArrayList<>();
    private static CategoryModel cat;

    public static List<CategoryModel> getData(){

        String query = "SELECT * FROM menu";

        try {
            Connection con = ConnectionDB.getConnexion();
            Statement st;
            st = ((java.sql.Connection) con).createStatement();
            ResultSet rs = st.executeQuery(query);



            int count=0;
            while (rs.next())
            {


                count++;
                int id = rs.getInt("Id_Menu");
                String Name = rs.getString("Category");
                String img = rs.getString("Menu_pic");

                cat = new CategoryModel();
                cat.setId_cat(id);
                cat.setName(Name);
                cat.setImgSrc(img);
                category.add(cat);

            }


            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }




        return category;
    }
}
