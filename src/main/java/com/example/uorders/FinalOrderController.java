package com.example.uorders;

import com.example.models.FinalOrder;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class FinalOrderController {

    @FXML
    private AnchorPane anchorPaneOrder;

    @FXML
    private ImageView imgOrder;

    @FXML
    private Label nameOrder;

    @FXML
    private Label priceOrder;

    @FXML
    private Label qteOrder;

    private FinalOrder finalOrder;

}
