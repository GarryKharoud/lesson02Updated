package com.example.lesson02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CardApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CardApplication.class.getResource("card-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Super Awesome Card Viewer 3000");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}