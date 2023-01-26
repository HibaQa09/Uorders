package com.example.Database;

import javafx.event.Event;
import javafx.scene.control.Alert;
import com.example.models.registerModel;
import com.example.uorders.RegisterController;

import java.sql.*;

public class RegisterDB {

    public static void SignUp(int Id, String FirstName, String LastName, String Email, String Mdp, String CMdp ){

        try {

            Connection con = ConnectionDB.getConnexion();
            Statement st;
            st = (Statement) ((java.sql.Connection) con).createStatement();
            ResultSet rs = st.executeQuery("select * from customer where EmailCus = '"+Email+"'");
            if(FirstName.isEmpty() || LastName.isEmpty() || Email.isEmpty() || Mdp.isEmpty() || CMdp.isEmpty()){

                System.out.println("Fields empty");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please fill all fields");
                alert.show();

            }else{

                if(rs.next() && rs.getInt(1)>0){
                    System.out.println("Student already exists");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Email already in use");
                    alert.show();
                }else{
                    String sql = ("INSERT INTO customer VALUES('"+Id+"','"+FirstName+"','"+LastName+"','"+Email+"','"+Mdp+"')");
                    st.executeUpdate(sql);
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setContentText("Registration complete");
                    alert.show();

                }
            }


        }catch (SQLException e1) {
            e1.printStackTrace();
        }

    }

}
