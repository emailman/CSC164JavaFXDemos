package p10;

// How to create a tab pane.
// Add a grid layout to a tab

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TabPaneDemo2 extends Application {


    @Override
    public void start(Stage stage) {

        // Setup a tab pane, disallowing tab closing
        TabPane tp = new TabPane();
        tp.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

        // Create a tab for rectangles
        Tab rectangle_tab = new Tab("Rectangle");

        // Create a tab for circles
        Tab circle_tab = new Tab("Circle");

        // Define a grid for rectangles
        GridPane rectangle_grid = new GridPane();
        rectangle_grid.setPadding(new Insets(20, 20, 20, 20));
        rectangle_grid.setHgap(10);
        rectangle_grid.setVgap(10);

        // Define the text fields

        // Length
        TextField tfLength = new TextField();

        // Width
        TextField tfMI = new TextField();

        // Perimeter
        TextField tfLastName = new TextField();

        // Area
        TextField tfArea = new TextField();

        // Place labels and text fields in the pane, one row at a time
        rectangle_grid.addRow(0, new Label("Length:"), tfLength);
        rectangle_grid.addRow(1, new Label("Width:"), tfMI);
        rectangle_grid.addRow(2, new Label("Perimeter:"), tfArea);
        rectangle_grid.addRow(3, new Label("Area:"), tfArea);

        // Add the grid to the tab
        rectangle_tab.setContent(rectangle_grid);



        // Define a label with the help message
        Label help_dia = new Label("Help Message: Buy low and sell high.");

        // Add the label to the help tab
        circle_tab.setContent(help_dia);


        // Add both tabs to the tab pane
        tp.getTabs().addAll(rectangle_tab, circle_tab);

        // Setup the scene and the stage
        Scene scene = new Scene(tp);
        stage.setTitle("Tab Pane Demo 2");
        stage.setX(400);
        stage.setY(100);
        stage.setHeight(500);
        stage.setWidth(600);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Window Closed");
        alert.setHeaderText(null);
        alert.setContentText("So long and thanks for all the fish");
        alert.showAndWait();
    }
}
