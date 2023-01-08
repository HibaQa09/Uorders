package com.example.uorders;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class pizzaMenuController {

    @FXML
    private ImageView pizzaMarg;

    @FXML
    private ImageView pizzaVeg;

    @FXML
    private ImageView pizzaPepp;

    @FXML
    private ImageView pizzaAnch;

    @FXML
    private AnchorPane MyPanel;
    private Parent fxml;

    @FXML
    void OpenYourOrder(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        Stage stage1 = new Stage();
        fxml = FXMLLoader.load(getClass().getResource("View/YourOrder.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

}
