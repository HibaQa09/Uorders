package com.example.Database;

import com.example.models.MyinfoModel;
import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.example.models.*;

public class loginDB {


    private static MyinfoModel user;
    public static String mail;
    /**
     * login to the app checks if the user is in the database then  it leads them to the first page of the app
     * @param Email
     * @param Password
     */

    public static boolean loginApp(String Email, String Password){

        user = new MyinfoModel();

        try{

            Connection con = ConnectionDB.getConnexion();
            Statement st;
            st = (Statement) ((java.sql.Connection) con).createStatement();
            ResultSet rs1= st.executeQuery("SELECT COUNT(*) FROM customer WHERE EmailCus = '"+Email+"'");
            if(Email.isEmpty() || Password.isEmpty()){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please fill all fields");
                alert.show();
                return false;

            }else{

                if(rs1.next() && rs1.getInt(1)>0){

                    ResultSet rs = st.executeQuery("Select * from customer where EmailCus ='"+Email+"' and PswdCus ='"+Password+"'");

                    if(rs.next()){

                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setContentText("Login successfully");
                        alert.show();

                        mail = Email;
                        return true;
                    }

                }else{

                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Student doesn't exist");
                    alert.show();
                    return false;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

}
