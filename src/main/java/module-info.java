module com.example.exampractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exampractice to javafx.fxml;
    exports com.example.exampractice;
}