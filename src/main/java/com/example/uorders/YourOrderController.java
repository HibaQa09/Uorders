package com.example.uorders;

import com.example.models.FinalOrder;
import com.example.models.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static com.example.Database.ItemDB.getData;


public class YourOrderController {

    @FXML
    private AnchorPane Panel1;
    private Parent fxml;

    private Stage stageOrder;
    @FXML
    private RadioButton cardPayment;

    @FXML
    private RadioButton cashPayment;

    @FXML
    private Button confirmOrder;

    @FXML
    private ImageView backButton;

    @FXML
    private TextField CommentsArea;

    @FXML
    private AnchorPane anchorOrder;

    @FXML
    private Label MenuItemLabel;

    private List<FinalOrder> orders = new ArrayList();

    @FXML
    void back(MouseEvent event) throws IOException {

        Panel1.getScene().getWindow().hide();
        stageOrder = (Stage) ((Node) event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/MenuView.fxml"));
        Scene scene = new Scene(fxml);
        stageOrder.setScene(scene);
        stageOrder.show();
    }


    @FXML
    void confirmOrder(ActionEvent e) throws IOException {

        if (cashPayment.isSelected()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Cash payment confirmed ok");
            alert.showAndWait();
            Panel1.getScene().getWindow().hide();
            stageOrder = (Stage) ((Node) e.getSource()).getScene().getWindow();
            fxml = FXMLLoader.load(getClass().getResource("View/Orderstats.fxml"));
            Scene scene = new Scene(fxml);
            stageOrder.setScene(scene);
            stageOrder.show();
        }

    }

    @FXML
    void addCard(ActionEvent event) throws IOException {

        Panel1.getScene().getWindow().hide();
        stageOrder = (Stage) ((Node) event.getSource()).getScene().getWindow();
        fxml = FXMLLoader.load(getClass().getResource("View/CardPayment.fxml"));
        Scene scene = new Scene(fxml);
        stageOrder.setScene(scene);
        stageOrder.show();

    }

    @FXML
    void ShowComment(ActionEvent event) {
        CommentsArea.setVisible(true);
        String comnt = CommentsArea.getText();

    }

    public void initialize(URL url, ResourceBundle resourceBundle) {

       // orders.addAll(getOrders());

        System.out.println("ggg" + orders.size());

        int column = 0;
        int row = 0;

        try {
            for (int i = 0; i <= orders.size(); i++) {

                FXMLLoader fxml = new FXMLLoader(getClass().getResource("View/Item.fxml"));
                Parent root = (Parent) fxml.load();
                AnchorPane anchorPane = new AnchorPane(root);
                anchorPane.setFocusTraversable(true);
                anchorPane.setPickOnBounds(false);
                ItemController itemController = fxml.getController();
                //itemController.setData(items.get(i));


                if (column == 1) {
                    column = 0;
                    row++;
                }
             /*   gridpane.add(anchorPane, column++, row);
                gridpane.setPickOnBounds(true);*/
                //GridPane.setMargin(anchorPane,new Insets(0,5,0,5));

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
