package com.example.uorders;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;
import com.example.models.CardPaymentModel;
import java.io.IOException;



import static com.example.Database.CardPaymentDB.Add;



public class AddCardController {


        @FXML
        private AnchorPane Panel1;
        private Parent fxml;
        @FXML
        private Button AddButton;

        @FXML
        private TextField CardNumber;

        @FXML
        private TextField NameCard;

        @FXML
        private ImageView backButton;

        @FXML
        private TextField cVc;

        @FXML
        private DatePicker datepicker;

        @FXML
        private TextField labelCard;

        @FXML
        /**

         This method is used to add a card payment to the system.
         It takes in an ActionEvent as a parameter and throws an IOException.
         The method first creates a new CardPaymentModel object and sets its properties
         using the values entered by the user in the corresponding text fields.
         Then it calls the Add() method, passing in the card details as parameters.
         Next, the current window is closed and a new window is opened, displaying the YourOrder view.
         */
        void Addcard(javafx.event.ActionEvent event) throws IOException {

            CardPaymentModel Card = new CardPaymentModel();
            Card.setName(NameCard.getText());
            Card.setCardNumber(CardNumber.getText());
            Card.setExpDate(datepicker.getValue());
            Card.setCvc(cVc.getText());
            Card.setLabel(labelCard.getText());

            Add(  Card.getCardNumber(),  Card.getName(),  Card.getExpDate(), Card.getCvc(),  Card.getLabel());


            Panel1.getScene().getWindow().hide();
            Stage stage1 = new Stage();
            fxml = FXMLLoader.load(getClass().getResource("View/YourOrder.fxml"));
            Scene scene = new Scene(fxml);
            stage1.setScene(scene);
            stage1.show();
        }
            @FXML
        void back(MouseEvent event) throws IOException {
                Panel1.getScene().getWindow().hide();
                Stage stage1 = new Stage();
                fxml = FXMLLoader.load(getClass().getResource("View/YourOrder.fxml"));
                Scene scene = new Scene(fxml);
                stage1.setScene(scene);
                stage1.show();

        }



}


