package com.example.Database;
import com.example.models.*;
import com.example.Database.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class myInfoDB {

    public static MyinfoModel user;
    public static void Display(String Email, String Name ) throws SQLException {

        try {


            Connection con = ConnectionDB.getConnexion();
            Statement st;
            st = (Statement) ((java.sql.Connection) con).createStatement();
            ResultSet rs1 = st.executeQuery("SELECT * FROM customer WHERE EmailCus = '" + Email + "'");
            if(rs1.next()) {
                rs1.getString("Fname_Cus");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
