package p3;

/*
 * Created by emailman on 3/10/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Demo3 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Circle circle = new Circle(100, 100, 50);
        // circle.setCenterX(100);
        // circle.setCenterY(100);
        // circle.setRadius(50);
        circle.setStroke(Color.BLUEVIOLET);
        circle.setFill(Color.BEIGE);

        Circle circle1 = new Circle(200, 200, 50);

        Pane pane = new Pane();
        pane.getChildren().addAll(circle, circle1);

        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setTitle("JavaFX Project 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
