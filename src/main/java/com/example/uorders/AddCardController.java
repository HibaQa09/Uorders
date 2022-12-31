package com.example.uorders;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

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
        private TextField expDate;

        @FXML
        private TextField labelCard;

        @FXML
        void Addcard(ActionEvent event) {


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


