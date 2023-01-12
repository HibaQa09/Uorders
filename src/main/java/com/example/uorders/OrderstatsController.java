package com.example.uorders;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class OrderstatsController {
    @FXML
    private AnchorPane OrderStatus;
    private Parent fxml;

    @FXML
    private ImageView cart;

    @FXML
    private ImageView menuButton;

    @FXML
    private RadioButton orderConfButton;

    @FXML
    private RadioButton orderReady;

    @FXML
    private RadioButton orderinPrep;

    @FXML
    private ImageView returnButtton;
    Stage stage1 = new Stage();


    @FXML
    void Cart(MouseEvent event) throws IOException  {
        OrderStatus.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/MyOrdersView.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }



    @FXML
    void Return(MouseEvent event)  throws IOException {
        OrderStatus.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/MenuView.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();
    }
}
