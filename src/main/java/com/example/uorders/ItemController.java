package com.example.uorders;

import com.example.models.Item;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Duration;

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

    private static int chosenItem =0;

    private Item item;


        public void setData(Item item) throws MalformedURLException {
            this.item = item;

            nameItem.setText(item.getNameItem().toString());
            priceItem.setText(String.valueOf(item.getPriceItem()));
            detailsItem.setText(item.getDetailsItem());
            String path = item.getImgItem();
            File file = new File(path);
            String localUrl = file.toURI().toURL().toString();
            Image thumbnail = new Image(localUrl,false);
            imgItem.setImage(thumbnail);

        }

    public void chooseItem(MouseEvent mouseEvent) {

    }
}


