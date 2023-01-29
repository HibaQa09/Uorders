package com.example.Database;

import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ChangePswdDB {
    /**

    * This method is used to change the password of a customer.

     *@param email The email of the customer.

     *@param Cpassword The current password of the customer.

     *@param Npassword The new password of the customer.

     *@return Returns 'true' if the password change is successful, 'false' otherwise.
     */

    public static boolean ChangePswd(String email, String Cpassword, String Npassword) {
        try {
            Connection con = ConnectionDB.getConnexion();
            String sql = "SELECT PswdCus FROM Customer WHERE EmailCus = '" + email + "'";
            Statement stmt;
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            String storedPassword = rs.getString("PswdCus");

            if (Cpassword.isEmpty()) {

                System.out.println("Fields empty");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please fill all fields");
                alert.show();
                return false;
            } else {
                if (storedPassword.equals(Cpassword)) {
                    String updateSql = "UPDATE Customer SET PswdCus = '" + Npassword + "' WHERE EmailCus = '" + email + "'";
                    stmt.executeUpdate(updateSql);

                    System.out.println("Password changed successfully");
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setContentText("Password changed successfully");
                    alert.show();
                } else {
                    System.out.println("Old password is incorrect");
                }




            }

            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
