package com.example.uorders;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuItemController {

    @FXML
    private AnchorPane Menu;
    @FXML
    private ImageView pizzaMarg;

    @FXML
    private ImageView pizzaVeg;

    @FXML
    private ImageView pizzaPepp;

    @FXML
    private ImageView pizzaAnch;

    private Parent fxml;

    private Stage itemMenu;


    @FXML
    void back(MouseEvent event) throws IOException {
        Menu.getScene().getWindow().hide();
        itemMenu = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/MenuView.fxml"));
        Scene scene = new Scene(fxml);
        itemMenu.setScene(scene);
        itemMenu.show();
    }


    public void cart(MouseEvent mouseEvent) throws IOException{
        Menu.getScene().getWindow().hide();
        itemMenu = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/YourOrder.fxml"));
        Scene scene = new Scene(fxml);
        itemMenu.setScene(scene);
        itemMenu.show();
    }
}
