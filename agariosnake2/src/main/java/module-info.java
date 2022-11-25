module com.example.agariosnake2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.agariosnake2 to javafx.fxml;
    exports com.example.agariosnake2;
}