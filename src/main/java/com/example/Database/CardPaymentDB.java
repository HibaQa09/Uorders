package com.example.Database;

import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class CardPaymentDB {
    public static void Add(String CardNumber, String NameCard, LocalDate dateexp, String cvc, String Label) {

        try {

            Connection con = ConnectionDB.getConnexion();
            Statement st;
            st = (Statement) ((java.sql.Connection) con).createStatement();
            ResultSet rs = st.executeQuery("select * from CardPayment where CardNumber = '" + CardNumber + "'");
            if (CardNumber.isEmpty() || NameCard.isEmpty() || dateexp == null || cvc.isEmpty() || Label.isEmpty()) {

                System.out.println("Fields empty");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please fill all fields");
                alert.show();

            }else {

                if(CardNumber.length()!=16){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please Make sure You have inserted all 16 digits of your card");
                    alert.show();

                }else {

                    if (rs.next() && rs.getInt(1) > 0) {

                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Card already in use");
                        alert.show();

                    }else {
                        String sql = ("INSERT INTO CardPayment VALUES('" + CardNumber + "','" + NameCard + "','" + dateexp + "','" + cvc + "','" + Label + "')");
                        st.executeUpdate(sql);
                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                        alert.setContentText("Card Added with success ");
                        alert.show();


                    }
                }
            }


        } catch (SQLException e1) {
            e1.printStackTrace();
        }


    }
}

