package com.example.uorders;

import com.example.models.FinalOrder;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class FinalOrderController {

    @FXML
    private AnchorPane anchor;

    @FXML
    private Text nameOrder;

    @FXML
    private Text price;

    @FXML
    private Text quantity;

    private FinalOrder finalOrder;

}
