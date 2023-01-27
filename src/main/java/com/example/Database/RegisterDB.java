package com.example.Database;

import javafx.event.Event;
import javafx.scene.control.Alert;
import com.example.models.registerModel;
import com.example.uorders.RegisterController;

import java.sql.*;
import com.example.uorders.RegisterController;


public class RegisterDB {


    public static boolean SignUp(int Id, String FirstName, String LastName, String Email, String Mdp, String CMdp ){

        try {

            Connection con = ConnectionDB.getConnexion();
            Statement st;
            st = (Statement) ((java.sql.Connection) con).createStatement();
            ResultSet rs1= st.executeQuery("SELECT COUNT(*) FROM customer WHERE EmailCus = '"+Email+"'");
            if(FirstName.isEmpty() || LastName.isEmpty() || Email.isEmpty() || Mdp.isEmpty() || CMdp.isEmpty()){

                System.out.println("Fields empty");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please fill all fields");
                alert.show();
                return false;

            }else{

                if(rs1.next() && rs1.getInt(1)>0){
                    System.out.println("Student already exists");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Email already in use");
                    alert.show();
                    return false;

                }else{

                    if(!Mdp.equals(CMdp)){

                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Please make sure your passwords match");
                        alert.show();
                        return false;

                    }else {

                        if (Mdp.length() > 8) {

                            String sql = ("INSERT INTO customer VALUES('" + Id + "','" + FirstName + "','" + LastName + "','" + Email + "','" + Mdp + "')");
                            st.executeUpdate(sql);
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setContentText("Registration complete");
                            alert.show();
                            return true;

                        } else {

                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("Please make sure your passwords is strong enough");
                            alert.show();
                            return false;

                        }

                    }
                }

            }


        }catch (SQLException e1) {
            e1.printStackTrace();
        }

        return false;
    }

}
