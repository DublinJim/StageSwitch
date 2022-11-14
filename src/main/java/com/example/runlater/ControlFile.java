package com.example.runlater;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Border;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;



public class ControlFile implements Initializable {
private Stage stage;
    public VBox vBoxRoot;
    private Scene scene;
    public Button btn2;
    private   ProgressBar progressBar = new ProgressBar();
  private ProgressIndicator progressIndicator = new ProgressIndicator();

  private HelloApplication helloApplication = new HelloApplication();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vBoxRoot.getChildren().add(progressBar);
        vBoxRoot.getChildren().add(progressIndicator);

        TextArea textArea= new TextArea("hello");
        textArea.setWrapText(true);
        textArea.setBorder(Border.stroke(Color.BLUE));
        textArea.autosize();
        textArea.setPrefRowCount(1);
        textArea.setPrefColumnCount(4);
        textArea.setPrefSize(50,10);
        vBoxRoot.getChildren().add(textArea);

    }


    public void getStageFromMain(ActionEvent actionEvent) {
        stage= HelloApplication.getNewStage();
        System.out.println("Stage acquired " + stage.getTitle());
        scene=HelloApplication.newStage.getScene();
        Button newButton = new Button("AfterLife");
        vBoxRoot.getChildren().add(newButton);




    }
}
