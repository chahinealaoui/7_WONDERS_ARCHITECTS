package com.example.wondersarchitects;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    /* lancement du controller sur l'interface */
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("deckView.fxml"));
        Scene scene = new Scene(root);


        primaryStage.setTitle("Deck Of Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}