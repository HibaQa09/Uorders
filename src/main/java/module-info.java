module com.example.uorders {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uorders to javafx.fxml;
    exports com.example.uorders;
}