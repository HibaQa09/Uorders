package com.example.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;



public class YourOrderController {

    @FXML
    private AnchorPane Panel1;
    private Parent fxml;

    private Stage stageOrder;
    @FXML
    private RadioButton cardPayment;

    @FXML
    private RadioButton cashPayment;

    @FXML
    private Button confirmOrder;

    @FXML
    private ImageView backButton;

    @FXML
    private TextField CommentsArea;

    @FXML
    void back(MouseEvent event) throws IOException {

        Panel1.getScene().getWindow().hide();
        stageOrder = (Stage) ((Node) event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/MenuView.fxml"));
        Scene scene = new Scene(fxml);
        stageOrder.setScene(scene);
        stageOrder.show();
    }


    @FXML
    void confirmOrder(ActionEvent e) throws IOException {

        if (cashPayment.isSelected()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Cash payment confirmed ok");
            alert.showAndWait();
            Panel1.getScene().getWindow().hide();
            stageOrder = (Stage) ((Node) e.getSource()).getScene().getWindow();
            fxml = FXMLLoader.load(getClass().getResource("View/Orderstats.fxml"));
            Scene scene = new Scene(fxml);
            stageOrder.setScene(scene);
            stageOrder.show();
        }

    }

    @FXML
    void addCard(ActionEvent event) throws IOException {

        Panel1.getScene().getWindow().hide();
        stageOrder = (Stage) ((Node) event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/CardPayment.fxml"));
        Scene scene = new Scene(fxml);
        stageOrder.setScene(scene);
        stageOrder.show();

    }

    @FXML
    void ShowComment(ActionEvent event) {
        CommentsArea.setVisible(true);
        String comnt = CommentsArea.getText();


    }

}
