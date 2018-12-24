/*
*
*
*
*
*
*
 */
package sample;

import environment.Cell;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hunting Simulatior");

        //adding a button
        Button startButton = new Button("Start");

        //adding a gridpane layout
        TilePane pane = new TilePane();

        pane.setPadding(new Insets(10,10,10,10));
        pane.setHgap(20);
        pane.setVgap(30);

        pane.getChildren().add(startButton);

        //creating an array of 3 by 3 objects of type cell
        Cell cells[][] = new Cell[3][3];

        for(int i = 0; i < cells.length; i++) {
            for(int j = 0; j < cells.length; j++) {


            }
        }

        Scene scene = new Scene(pane, 300,250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



}
