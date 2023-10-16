module com.example.adresssbook {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adresssbook to javafx.fxml;
    exports com.example.adresssbook;
}