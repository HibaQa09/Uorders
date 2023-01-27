package com.example.uorders;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class login {

    private Parent fxml;

    @FXML
    private TextField Email;
    @FXML
    private AnchorPane MyPanel;
    @FXML
    private PasswordField Password;

    @FXML
    private Button SignUp;

    @FXML
    private Button button_login;

    @FXML
    private Button forgot;

    @FXML
    private Text label_login;

    private Stage stage;

    public void login(MouseEvent mouseEvent) throws IOException {
        MyPanel.getScene().getWindow().hide();
        Stage stage1 = new Stage();
        fxml = FXMLLoader.load(getClass().getResource("View/MenuView.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();
    }

}