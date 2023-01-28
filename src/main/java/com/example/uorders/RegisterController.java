package com.example.uorders;

import com.example.Database.RegisterDB;
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
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import com.example.models.registerModel;
import static com.example.Database.RegisterDB.SignUp;


public class RegisterController {

    @FXML
    private AnchorPane MyPanel;

    private Parent fxml;

    private Stage stage;

    @FXML
    private ImageView BackButton;

    @FXML
    private PasswordField CMdp;

    @FXML
    private TextField Email;

    @FXML
    private TextField FirstName;

    @FXML
    private TextField LastName;

    @FXML
    private PasswordField Mdp;

    @FXML
    private ImageView Panel;

    @FXML
    private Button RegisterButton;

    private registerModel user;




    public void back(MouseEvent mouseEvent) throws IOException {
        Panel.getScene().getWindow().hide();
        stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/CardPayment.fxml"));
        Scene scene = new Scene(fxml);
        stage.setScene(scene);
        stage.show();
    }

    public void register(javafx.event.ActionEvent event) throws IOException {

        boolean x;
        do {

            user = new registerModel();
            user.setFirstName( FirstName.getText());
            user.setLastName( LastName.getText() );
            user.setEmail( Email.getText() );
            user.setPasswrd( Mdp.getText() );
            user.setPasswrdConfirmation( CMdp.getText() );

            x = SignUp(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPasswrd(), user.getPasswrdConfirmation());

            if (x){
                break;
            }

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            fxml = FXMLLoader.load(getClass().getResource("View/register.fxml"));
            Scene scene = new Scene(fxml);
            stage.setScene(scene);
            stage.show();

        } while (!x);


        MyPanel.getScene().getWindow().hide();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/Login.fxml"));
        Scene scene = new Scene(fxml);
        stage.setScene(scene);
        stage.show();

    }
}
