module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens 实验1 to javafx.fxml;
    exports 实验1;
}