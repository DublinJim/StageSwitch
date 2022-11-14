package com.example.runlater;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage newStage;

    public Scene newScene;



    @Override
    public void start(Stage myStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        myStage.setTitle("Run-later");
        myStage.setScene(scene);
        myStage.hide();
        newStage= myStage;
        newScene=scene;
        newStage.setTitle("Stage 2");
        newStage.show();
    }

    public static Stage getNewStage() {
        return newStage;
    }

    public Scene getNewScene() {
        return newScene;
    }

    public static void main(String[] args) {
        launch();
    }
}