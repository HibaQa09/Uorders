package com.example.uorders;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterController {

    private Stage stage;

    @FXML
    private ImageView BackButton;

    private Parent fxml;

    @FXML
    private Button CancelButton;

    @FXML
    private AnchorPane MyPanel;

    @FXML
    private Button RegisterButton;

    @FXML
    void register(ActionEvent event) throws IOException {

        MyPanel.getScene().getWindow().hide();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/Myinfo.fxml"));
        Scene scene = new Scene(fxml);
        stage.setScene(scene);
        stage.show();
        }


    public void back(MouseEvent mouseEvent) throws IOException {
        MyPanel.getScene().getWindow().hide();
        Stage stage1 = new Stage();
        fxml = FXMLLoader.load(getClass().getResource("View/Login.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();
    }

}
