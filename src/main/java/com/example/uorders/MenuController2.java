package com.example.uorders;

import com.example.Database.ConnectionDB;
import com.example.models.CategoryModel;
import com.example.uorders.MenuCatController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import static com.example.Database.MenuCatDB.getData;

public class MenuController2 implements Initializable {

    @FXML
    private ImageView CartButton;

    @FXML
    private Button CartButton0;

    @FXML
    private Button MenuButton;

    @FXML
    private AnchorPane MyPanel;

    @FXML
    private GridPane grid;

    private List<CategoryModel> category = new ArrayList<>();
    private CategoryModel cat;
    private Stage stage1 ;
    private Parent fxml ;



    /*private List<CategoryModel> getData(){

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
            //System.out.println("queryexecutedsuccesfully");
            // iterate through the java resultset


            int count=0;
            while (rs.next())
            {


                count++;
                int id = rs.getInt("Id_Menu");
                String Name = rs.getString("Category");
                String img = rs.getString("Menu_pic");

                cat = new CategoryModel();
                cat.setId_cat(id);
                cat.setName(Name);
                //System.out.println(cat.getName());
                cat.setImgSrc(img);
                //System.out.println(cat.getImgSrc());
                category.add(cat);
                //System.out.println("size" + category.size());


                // print the results
                //System.out.format(" %s, %s, %s\n", id, Name, img);
                //System.out.println("ll"+count);
            }


            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }



         /*
        List<CategoryModel> category = new ArrayList<>();
        CategoryModel cat;

        for(int i=0;i<8;i++){
            cat = new CategoryModel();
            cat.setName("ola");
            cat.setImgSrc("Assets/tajine.png");
            category.add(cat);

        }
        return category;
    }*/



    @FXML
    void Cart(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/YourOrder.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void OpenCart(MouseEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/YourOrder.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();

    }

    @FXML
    void ShowMenu(ActionEvent event) throws IOException {
        MyPanel.getScene().getWindow().hide();
        stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/SidebarView.fxml"));
        Scene scene = new Scene(fxml);
        stage1.setScene(scene);
        stage1.show();


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        category.addAll(getData());
        //System.out.println("hi"+category.size());

        int column =0;
        int row =0;
        try {
            for(int i=0; i<8;i++) {


                /*fxml = FXMLLoader.load(getClass().getResource("View/MenuCat.fxml"));
                AnchorPane pane = new AnchorPane(fxml);
                /*
                MenuCatController itemController = fxml.getController();
                itemController.setData(category.get(i));

                 */



                FXMLLoader loader = new FXMLLoader(getClass().getResource("View/MenuCat.fxml"));

                Parent root = (Parent) loader.load();
                AnchorPane pane = new AnchorPane(root);
                MenuCatController controller = loader.<MenuCatController>getController();
                controller.setData(category.get(i));
                controller.setButtonId(category.get(i));







                if(column == 2){
                    column =0;
                    row ++;
                }

                grid.add(pane, column++, row);
                //System.out.println("hiiiiiibaaaaaa"+category.get(1).getImgSrc().toString());



            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}