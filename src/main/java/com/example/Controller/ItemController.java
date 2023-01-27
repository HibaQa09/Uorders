package com.example.Controller;

import com.example.model.Item;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import java.io.File;
import java.net.MalformedURLException;

public class ItemController {


    @FXML
    private AnchorPane Item;

    @FXML
    private Text detailsItem;

    @FXML
    private ImageView imgItem;

    @FXML
    private Text nameItem;

    @FXML
    private Text priceItem;


        private Item item;

        public void setData(Item item) throws MalformedURLException {
            this.item = item;

            nameItem.setText(item.getNameItem().toString());
            priceItem.setText(String.valueOf(item.getPriceItem()));
            detailsItem.setText(item.getDetailsItem());
            String path = item.getImgItem();
            File file = new File(path);
           /// File file = new File("src/main/resources/com/example/Controller/Assets/breakfast1.png");
            String localUrl = file.toURI().toURL().toString();
            Image thumbnail = new Image(localUrl,false);
            imgItem.setImage(thumbnail);

           /* Image img = new Image(item.getImgItem());
            imgItem = new ImageView();
            imgItem.setImage(img);*/


        }
    }


