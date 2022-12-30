package com.example.uorders;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;


public class OrderController {

    @FXML
    private Label NbrItems;

    int nbr;


    @FXML
    private Button CommentButton;

    @FXML
    private TextField CommentsArea;


    @FXML
    private Button CartButton;

    @FXML
    private Button DecreaseButton;

    @FXML
    private Button IncreaseButton;

    @FXML
    private Button OrderButton;

    @FXML
    private Button ReturnButton;



    @FXML
    private AnchorPane MyPanel;
    private Parent fxml;


    @FXML
    void Decrease(ActionEvent event) {
        nbr = Integer.parseInt(NbrItems.getText());
        nbr--;
        NbrItems.setText(String.valueOf(nbr));

    }

    @FXML
    void Increase(ActionEvent event) {
        nbr = Integer.parseInt(NbrItems.getText());
        nbr++;
        NbrItems.setText(String.valueOf(nbr));


    }

    @FXML
    void ProceedToConfirmation(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        Stage stage1 = new Stage();
        fxml = FXMLLoader.load(getClass().getResource("View/YourOrder.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void ShowComment(ActionEvent event) {
        CommentsArea.setVisible(true);
        String comnt = CommentsArea.getText();

    }
    @FXML
    void Cart(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        Stage stage1 = new Stage();
        fxml = FXMLLoader.load(getClass().getResource("View/YourOrder.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }
    @FXML
    void Return(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        Stage stage1 = new Stage();
        fxml = FXMLLoader.load(getClass().getResource("View/MenuView.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }


}
