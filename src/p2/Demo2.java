package p2;

/*
 * Created by emailman on 3/10/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Demo2 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new StackPane();
        pane.getChildren().add(new Button("Very Very Extremely OK"));

        Scene scene = new Scene(pane, 200, 50);

        primaryStage.setTitle("JavaFX Project 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
