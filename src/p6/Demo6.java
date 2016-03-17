package p6;

/*
 * Created by emailman on 3/10/2016.
 */

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Demo6 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.setHgap(10);
        pane.setVgap(10);

        // Define the text fields

        // First name
        TextField tfFirstName = new TextField();

        // Middle Initial
        TextField tfMI = new TextField();

        // Last name
        TextField tfLastName = new TextField();

        // Place labels and text fields in the pane, one row at a time
        pane.addRow(0, new Label("First Name:"), tfFirstName);

        pane.addRow(1, new Label("MI:"), tfMI);

        pane.addRow(2, new Label("Last Name:"), tfLastName);

        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 0, 3);
        GridPane.setColumnSpan(btAdd,2);
        GridPane.setHalignment(btAdd, HPos.CENTER);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("JavaFX Project 6");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
