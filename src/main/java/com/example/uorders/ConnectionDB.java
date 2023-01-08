package com.example.uorders;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionDB {
    public static Connection getConnexion() {
        Connection con = null;
        try {
            // 1 Charger le driver mysql
            Class.forName("com.mysql.jdbc.Driver");

            // 2 Créer la connexion
            con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tp_cs" , "root","");
            System.out.println("Connection is created successfully:");

            //3 Créer un état de connexion
            Statement st = ((java.sql.Connection) con).createStatement();

        }catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }
        return con;
//lol
    }

    public static void main(String[] args) {
        getConnexion();
    }
}
