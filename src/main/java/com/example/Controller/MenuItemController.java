package com.example.Controller;

import com.example.Database.ConnectionDB;
import com.example.model.Item;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import static com.example.Database.ItemDB.getData;

public class MenuItemController implements Initializable {

    @FXML
    private AnchorPane Menu;

    private Parent fxml;

    private Stage itemMenu;

    @FXML
    private GridPane gridpane;

    @FXML
    private ScrollPane scrollpane;


    private List<Item> items = new ArrayList();

    @FXML
    private AnchorPane ItemPane;

    @FXML
    private Button AddCartBtn;

    @FXML
    private Button DecreaseButton;

    @FXML
    private ImageView Img;

    @FXML
    private Button IncreaseButton;


    @FXML
    private Label NbrItems;

    @FXML
    private Label Total;

    @FXML
    private ImageView backButton;

    @FXML
    private ImageView cart;


    @FXML
    private Label label;

    private int nbr;
   /* private List<OrderItemModel> orders = new ArrayList<>();
    private OrderItemModel order;*/
    private Double Tot=45.0;


    @FXML
    void back(MouseEvent event) throws IOException {
      /*  Menu.getScene().getWindow().hide();
        itemMenu = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/MenuView.fxml"));
        Scene scene = new Scene(fxml);
        itemMenu.setScene(scene);
        itemMenu.show();*/

        TranslateTransition translate = new TranslateTransition();
        translate.setNode(ItemPane);
        ItemPane.setVisible(true);
        translate.setDuration(Duration.millis(1000));
        translate.setByY(-10);
        translate.play();
    }


    public void cart(MouseEvent mouseEvent) throws IOException{
        Menu.getScene().getWindow().hide();
        itemMenu = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/YourOrder.fxml"));
        Scene scene = new Scene(fxml);
        itemMenu.setScene(scene);
        itemMenu.show();
    }

    @FXML
    void Decrease(ActionEvent event) {

    }

    @FXML
    void Increase(ActionEvent event) {

    }
    @FXML
    void AddToCart(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        items.addAll(getData());

        System.out.println("ggg"+ items.size());

        int column=0;
        int row = 0;

            try {
                for(int i = 0 ;i<=3;i++) {

                    FXMLLoader fxml = new FXMLLoader(getClass().getResource("View/Item.fxml"));
                    Parent root = (Parent) fxml.load();
                    AnchorPane anchorPane = new AnchorPane(root);
                    ItemController itemController = fxml.getController();
                    itemController.setData(items.get(i));

                    if (column == 2) {
                        column = 0;
                        row++;
                    }
                    gridpane.add(anchorPane, column++, row);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }

    public void Decrease(javafx.event.ActionEvent actionEvent) {

        nbr = Integer.parseInt(NbrItems.getText());
        if(nbr>0) {
            nbr--;
        }else{
            nbr=0;
        }
        NbrItems.setText(String.valueOf(nbr));
        System.out.println(Total.getText());
        Total.setText("Total : "+ Tot*nbr +"DHs");
    }

    public void Increase(javafx.event.ActionEvent actionEvent) {

        nbr = Integer.parseInt(NbrItems.getText());
        nbr++;
        NbrItems.setText(String.valueOf(nbr));
        Total.setText("Total : "+ Tot*nbr +"DHs");

    }

    public void AddToCart(javafx.event.ActionEvent actionEvent) {
         /*ChosenItem = new ChosenItem();
        ChosenItem.setId_item(1);
        ChosenItem.setQuantity(10);
        chosen.add(ChosenItem);
        System.out.println(chosen+"hh");*/

        System.out.println("hh");
    }
}
