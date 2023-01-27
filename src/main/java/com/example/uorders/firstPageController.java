package com.example.uorders;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class firstPageController {

    @FXML
    private Button Loginb;
    private Parent fxml;

    private Stage stage;
    @FXML
    private Text label_pres;

    @FXML
    private Text label_welcome;

    @FXML
    private AnchorPane pan1;

    @FXML
    private ImageView panel;

    @FXML
    private Button registerb;

    @FXML
    void login(MouseEvent event) throws IOException {
        pan1.getScene().getWindow().hide();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/Login.fxml"));
        Scene scene = new Scene(fxml);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void register(MouseEvent event) throws IOException {
        pan1.getScene().getWindow().hide();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/register.fxml"));
        Scene scene = new Scene(fxml);
        stage.setScene(scene);
        stage.show();
    }

}
