package com.example.uorders;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MyOrdersController {

    @FXML
    private ImageView BackButton;

    @FXML
    private TextField ItemDescrption;

    @FXML
    private Pane OrderPane;

    @FXML
    private AnchorPane Panel0;
    @FXML
    private Parent fxml;
    private Stage stage1 ;

    @FXML
    private TextField PriceDescriptipon;

    @FXML
    void Return(MouseEvent event) throws IOException {
        Panel0.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/SidebarView.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

}
