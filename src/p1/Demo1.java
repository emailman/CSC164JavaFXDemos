package p1;

/*
 * Created by emailman on 3/10/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Demo1 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 300);
        primaryStage.setTitle("JavaFX Project 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
