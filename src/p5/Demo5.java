package p5;

/*
 * Created by emailman on 3/10/2016.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Demo5 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.setHgap(10);
        pane.setVgap(10);

        // Define the text fields

        // First name
        TextField tfFirstName = new TextField();

        // Middle Initial
        TextField tfMI = new TextField();
        tfMI.setPrefColumnCount(1);

        // Last name
        TextField tfLastName = new TextField();

        pane.getChildren().addAll(
                new Label("First Name:"), tfFirstName,
                new Label("MI"), tfMI,
                new Label("Last Name:"), tfLastName);

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("JavaFX Project 5");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
