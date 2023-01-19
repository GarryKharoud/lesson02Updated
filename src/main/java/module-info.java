module com.example.lesson02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson02 to javafx.fxml;
    exports com.example.lesson02;
}