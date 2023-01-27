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

public class SidebarController {

    @FXML
    private ImageView BackButton;

    @FXML
    private Button HelpBtn;

    @FXML
    private Button LogOutBtn;

    @FXML
    private Button MyInfoBtn;

    @FXML
    private AnchorPane MyPanel;

    @FXML
    private Button MyordersBtn;

    @FXML
    private AnchorPane Panel0;
    private Parent fxml;
    private Stage stage1 ;

    @FXML
    void CheckInfo(ActionEvent event) {

    }


    @FXML
    void CheckOrders(ActionEvent event) throws IOException {
        Panel0.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/MyOrdersView.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void GotoHelp(ActionEvent event) {

    }

    @FXML
    void LogOut(ActionEvent event) {

    }

    @FXML
    void Return(MouseEvent event) throws IOException {
        Panel0.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/Menutest.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

}
