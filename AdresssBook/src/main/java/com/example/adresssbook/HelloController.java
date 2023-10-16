package com.example.adresssbook;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDelete;

    @FXML
    void new_Alert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Видалення");

        alert.setHeaderText("Result:");
        alert.setContentText("Ви успішно видалили запис!");

        alert.showAndWait();
    }


    @FXML
    public Button btnAdd;
    @FXML
    void showDialog() {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("two.fxml"));
        try {
            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load(), 600, 120);
            stage.setResizable(false);
            stage.setTitle("twooo");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(btnAdd.getScene().getWindow());
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void initialize() {

    }

}
