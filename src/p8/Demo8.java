package p8;

/*
 * Created by emailman on 3/10/2016.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo8 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();

        pane.setTop(getHBox());
        pane.setLeft(getVBox());

        Scene scene = new Scene(pane);
        primaryStage.setTitle("JavaFX Project 8");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();
    }

    private VBox getVBox() {
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));
        vBox.setStyle("-fx-background-color: green");
        vBox.getChildren().add(new Label("Courses"));

        Label[] courses = {new Label("CSC 114"),
                            new Label("CSC 164"),
                            new Label("CSC 214"),
                            new Label("CSC 264")};

        for (Label each : courses) {
            VBox.setMargin(each, new Insets(0, 0, 0, 15));
            vBox.getChildren().add(each);
        }

        return vBox;
    }

    private HBox getHBox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().addAll(new Label("Pick a button"),
                new Button("one"), new Button("two"), new Button("three"));
        return hBox;
    }
}

