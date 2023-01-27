package com.example.uorders;

import com.example.Database.ConnectionDB;
import com.example.models.CategoryModel;
import com.example.models.ChosenItem;
import com.example.models.OrderItemModel;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class OrderController implements Initializable {



    private List<ChosenItem> chosen = new ArrayList<>();
    private ChosenItem ChosenItem;
    @FXML
    private Button CommentButton;

    @FXML
    private TextField CommentsArea;

    @FXML
    private GridPane gridpane;


    @FXML
    private Button CartButton;

    @FXML
    private Button DecreaseButton;

    @FXML
    private Button IncreaseButton;

    @FXML
    private Button OrderButton;

    @FXML
    private Button ReturnButton;

    @FXML
    private Label Total;
    @FXML
    private Button AddCartBtn;

    @FXML
    private AnchorPane ItemPane;
    @FXML
    private Label NbrItems;
    @FXML
    private AnchorPane MyPanel;
    private Parent fxml;
    private Stage stage1 ;

    private int nbr;
    private List<OrderItemModel> orders = new ArrayList<>();
    private OrderItemModel order;
    private Double Tot=45.0;

    private List<OrderItemModel> getData() {

        String query = "SELECT * FROM menu";
        //String nbr_columns = "SELECT COUNT(*) menu";
        try {
            Connection con = ConnectionDB.getConnexion();
            Statement st;
            st = ((java.sql.Connection) con).createStatement();
            ResultSet rs = st.executeQuery(query);
            // ResultSet rs1= st.executeQuery(nbr_columns);
            //Retrieving the result
            //rs1.next();
            //int count = rs1.getInt(1);
            //System.out.println("nbr is"+count);
            System.out.println("queryexecutedsuccesfully");
            // iterate through the java resultset


            int count = 0;
            while (rs.next()) {


                count++;
                int id = rs.getInt("Id_Menu");
                String Name = rs.getString("Category");
                String img = rs.getString("Menu_pic");
                Double price = (double) 55.2;

                order = new OrderItemModel();
                order.setDescription(Name);
                //System.out.println(cat.getName());
                order.setImg(img);
                //System.out.println(cat.getImgSrc());
                orders.add(order);
                //System.out.println("size" + category.size());


                // print the results
                System.out.format(" %s, %s, %s ,%s\n", id, Name, img , price);
                //System.out.println("ll"+count);
            }


            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;

    }

    @FXML
    void Decrease(ActionEvent event) {
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

    @FXML
    void Increase(ActionEvent event) {
        nbr = Integer.parseInt(NbrItems.getText());
        nbr++;
        NbrItems.setText(String.valueOf(nbr));
        Total.setText("Total : "+ Tot*nbr +"DHs");
    }
    @FXML
    void AddToCart(ActionEvent event) {
        ChosenItem = new ChosenItem();
        ChosenItem.setId_item(1);
        ChosenItem.setQuantity(10);
        chosen.add(ChosenItem);
        System.out.println(chosen+"hh");
    }

        @FXML
    void ProceedToConfirmation (ActionEvent event) throws IOException {

        /*stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/OrderItemView.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();*/


            TranslateTransition translate = new TranslateTransition();
            translate.setNode(ItemPane);
            ItemPane.setVisible(true);
            translate.setDuration(Duration.millis(1000));
            translate.setByY(-10);
            translate.play();



    }

    @FXML
    void ShowComment(ActionEvent event) {
        CommentsArea.setVisible(true);
        String comnt = CommentsArea.getText();

    }
    @FXML
    void Cart(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        //Stage stage1 = new Stage();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/YourOrder.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }
    @FXML
    void Return(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/FirstPage.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        orders.addAll(getData());
        System.out.println("hihihohokoko");


        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View/OrderItemView.fxml"));

            Parent root = (Parent) loader.load();
            AnchorPane pane = new AnchorPane(root);
            gridpane.add(pane, 0, 0);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
