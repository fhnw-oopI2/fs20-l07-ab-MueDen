package ch.fhnw.oop2.module07.ab2;

import javafx.application.Application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.desktop.AppForegroundListener;

public class Starter extends Application {

    @Override
    public void start(Stage primaryStage) {
        Parent gui = new ApplicationUI();
        Scene scene = new Scene(gui);

        primaryStage.setTitle("JavaFX APP");
        primaryStage.setScene(scene);
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        // primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
