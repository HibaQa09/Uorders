package com.example.uorders;
import com.example.Database.ConnectionDB;
import com.example.Database.ConnectionDB;
import com.example.models.Item;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
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

//import java.awt.event.ActionEvent;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

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

    private static int chosenItem =0;


    @FXML
    void back(MouseEvent event) throws IOException {
        System.out.println("nananananan");

      /*  Menu.getScene().getWindow().hide();
        itemMenu = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/MenuView.fxml"));
        Scene scene = new Scene(fxml);
        itemMenu.setScene(scene);
        itemMenu.show();*/
        while(chosenItem==0){

            TranslateTransition translate = new TranslateTransition();
            translate.setNode(ItemPane);
            ItemPane.setVisible(true);
            translate.setDuration(Duration.millis(1000));
            translate.setByY(-10);
            translate.play();
            chosenItem++;
        };
    }


    public void cart(MouseEvent mouseEvent) throws IOException{
        Menu.getScene().getWindow().hide();
        itemMenu = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/YourOrder.fxml"));
        Scene scene = new Scene(fxml);
        itemMenu.setScene(scene);
        itemMenu.show();
    }

    private List<Item> getData(){
        int haha =MenuCatController.ChosenId ;
        System.out.println(" yarbiii tkhdem  ezbfguzegfyuezgf" +haha);

        items = new ArrayList();
        Item item ;

        try {

            Connection con = ConnectionDB.getConnexion();

            Statement st;
            st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from menu_item where menu_id =1");

            while (rs.next()) {

                item = new Item();

                item.setNameItem(rs.getString(2));
                item.setPriceItem(rs.getInt(3));
                item.setImgItem(rs.getString(4));
                item.setDetailsItem(rs.getString(6));

                String name = rs.getString(2);
                System.out.println("name:" +name);
                int p  = rs.getInt(3);
                System.out.println("price:" +p);
                String det =  rs.getString(6);
                System.out.println("details:" +det);

                items.add(item);

            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("error");

        }

        return items;
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
                //GridPane.setMargin(anchorPane,new Insets(0,5,0,5));

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