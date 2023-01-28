package com.example.uorders;

import com.example.Database.loginDB;
import com.example.models.MyinfoModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

import static com.example.Database.myInfoDB.Display;

public class myInfoController {

    @FXML
    private ImageView MyPanel;

    private Parent fxml;

    private Stage itemMenu;

    @FXML
    private Button change;

    @FXML
    private TextField email;

    @FXML
    private TextField idcard;

    @FXML
    private Text label_myinfo;

    @FXML
    private TextField name;

    @FXML
    private Button paymentM;
    private static MyinfoModel user;


    @FXML
    void changep(MouseEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        Stage stage1 = new Stage();
        fxml = FXMLLoader.load(getClass().getResource("View/Changepswd.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void paymentm(MouseEvent event) throws IOException {

        MyPanel.getScene().getWindow().hide();
        Stage stage1 = new Stage();
        fxml = FXMLLoader.load(getClass().getResource("View/CardPayment.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void display() throws SQLException {

        user = new MyinfoModel();
        Display(loginDB.mail , user.getName());
        System.out.println(loginDB.mail);
        System.out.println(user.getName());
        email.setText("loginDB.mail");
        //name.setText((user.getName()));

    }


}
