package com.example.uorders;

import com.example.models.CategoryModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class MenuCatController {

    @FXML
    private Label Cat_name;

    @FXML
    private Button CategoryButton;

    @FXML
    private ImageView img = new ImageView();

    private CategoryModel category;

    public static int ChosenId;

    @FXML
    private Stage stage1;

    private Parent fxml;

    public void setData(CategoryModel category) throws MalformedURLException {
        this.category=category;
        Cat_name.setText(category.getName());
        //System.out.println("hihihi"+category.getImgSrc());

        String path = category.getImgSrc();
        File file = new File(path);
        String localUrl = file.toURI().toURL().toString();
        Image thumbnail = new Image(localUrl, false);
        img.setImage(thumbnail);


    }

    public void setButtonId(CategoryModel category){

        int id_category  =category.getId_cat();
        CategoryButton.setId(String.valueOf(id_category));
        System.out.println("id setted"+id_category);

    }

    @FXML
    void OpenItemMenu(ActionEvent event) throws IOException {
        System.out.println("heloooooooo");

        // System.out.println("Action 2: " + event.getSource());
        if (event.getSource() instanceof Button) {
            Button clickedButton = (Button) event.getSource();
            if (clickedButton.getId().equals("1")) {
                System.out.println("Breakfast 1 was clicked!");
                ChosenId=1;
            }else if (clickedButton.getId().equals("2")) {
                System.out.println("salad 1 was clicked!");
            }else if (clickedButton.getId().equals("3")) {
                System.out.println("sandwish 1 was clicked!");
            }else if (clickedButton.getId().equals("4")) {
                System.out.println("tacos 1 was clicked!");
            }else if (clickedButton.getId().equals("5")) {
                System.out.println("Beldi 1 was clicked!");
            }else if (clickedButton.getId().equals("6")) {
                System.out.println("pizza 1 was clicked!");
            }else if (clickedButton.getId().equals("7")) {
                System.out.println("pasta 1 was clicked!");
            }else if (clickedButton.getId().equals("8")) {
                System.out.println("drinks 1 was clicked!");
            }

            //Menu.getScene().getWindow().hide();
            stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
            fxml = FXMLLoader.load(getClass().getResource("View/MenuItem.fxml"));
            Scene scene = new Scene(fxml);
            stage1.setScene(scene);
            stage1.show();


        }}


}