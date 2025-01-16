package org.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineExample extends Application {

    public void start(Stage stage) {

        // Set title for the stage
        stage.setTitle("Creating Line");

        // Create a line
        Line line = new Line(10.0f, 10.0f, 200.0f, 140.0f);

        // Create a Group
        Group group = new Group(line);

        // Translate the line to a position
        line.setTranslateX(100);
        line.setTranslateY(100);

        // Create a scene
        Scene scene = new Scene(group, 500, 300);

        // Set the scene
        stage.setScene(scene);

        // Show the stage
        stage.show();
    }

    // Main Method
    public static void main(String[] args) {
        // Launch the application
        launch(args);
    }
}
