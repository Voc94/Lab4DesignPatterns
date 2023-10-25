module com.example.fmethod {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fmethod to javafx.fxml;
    exports com.example.fmethod;
}