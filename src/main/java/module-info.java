module com.example.uorders {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.uorders to javafx.fxml;
    exports com.example.uorders;
}