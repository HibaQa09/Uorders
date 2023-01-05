package com.example.uorders;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class RegisterController {

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
    void cancel(ActionEvent event) {

    }

    @FXML
    void register(ActionEvent event) throws IOException {

        MyPanel.getScene().getWindow().hide();
        Stage stage1 = new Stage();
        fxml = FXMLLoader.load(getClass().getResource("View/MenuView.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();
    }

}
