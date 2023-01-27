package com.example.Database;
import com.example.models.Item;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class ItemDB {

    private static List<Item> items = new ArrayList();

    private Item item;

    public static List<Item> getData(){

        items = new ArrayList();
        Item item ;

        try {

            Connection con = ConnectionDB.getConnexion();

            Statement st;
            st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from menu_item where menu_id = 1");


            while (rs.next()) {

                item = new Item();

                item.setNameItem(rs.getString(                          2));
                item.setPriceItem(rs.getInt(3));
                item.setImgItem(rs.getString(4));
                item.setDetailsItem(rs.getString(6));

                String name = rs.getString(2);
                System.out.println("name:" +name);
                int p  = rs.getInt(3);
                System.out.println("price:" +p);
                String det =  rs.getString(6);
                System.out.println("details:" +det);

                items.add(item);

            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("error");

        }

        return items;
    }


}
