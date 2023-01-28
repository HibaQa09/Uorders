package com.example.uorders;

import com.example.models.loginModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.Database.loginDB.loginApp;

public class loginController {

    @FXML
    private TextField Email;

    @FXML
    private AnchorPane MyPanel;

    @FXML
    private ImageView Panel;

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

    private loginModel user;
    private Parent fxml;

    private Stage stage;
    @FXML
    void forgot1(MouseEvent event) {

    }

    @FXML
    void log(ActionEvent event) throws IOException {
        boolean x;

        do{

            user = new loginModel();
            user.setEmail(Email.getText());
            user.setPasswrd(Password.getText());

            x = loginApp(user.getEmail(), user.getPasswrd());

            if(x) {
                break;
            }

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            fxml = FXMLLoader.load(getClass().getResource("View/Login.fxml"));
            Scene scene = new Scene(fxml);
            stage.setScene(scene);
            stage.show();

        }while(!x);

        MyPanel.getScene().getWindow().hide();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/register.fxml"));
        Scene scene = new Scene(fxml);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void signup(MouseEvent event) {

    }

}
