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

import java.io.IOException;

public class MenuController {

    @FXML
    private Button BeldiButton;

    @FXML
    private Button BreakfastButton;

    @FXML
    private ImageView CartButton;

    @FXML
    private Button DrinksButton;

    @FXML
    private Button HamburgerMenu;

    @FXML
    private ImageView PastaButton;

    @FXML
    private Button PizzaButton;

    @FXML
    private Button SaladButton;

    @FXML
    private Button SandwichButton;

    @FXML
    private Button TacosButton;

    @FXML
    private Button CartButton0;

    @FXML
    private Button MenuButton;

    @FXML
    private AnchorPane MyPanel;
    private Parent fxml;
    private Stage stage1 ;


    @FXML
    void OpenBeldiMenu(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/orderView.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void OpenBreakfastMenu(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/pizzaMenu.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void OpenCart(MouseEvent event)  {


    }

    @FXML
    void OpenDrinksMenu(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/pizzaMenu.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void OpenPastaMenu(MouseEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/pizzaMenu.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void OpenPizzaMenu(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/pizzaMenu.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void OpenSaladMenu(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/pizzaMenu.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void OpenSandwichMenu(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/pizzaMenu.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void OpenTacosMenu(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/pizzaMenu.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void Cart(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/YourOrder.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }
    @FXML
    void ShowMenu(ActionEvent event) {

    }

}
