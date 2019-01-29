/*
*
*
*
*
*
*
 */
package sample;

import environment.Board;
import environment.Cell;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import java.io.IOException;

// import javafx.animation.Timeline; -->used to update a nodes properties, such as color, size etc. only need to update the centerPane(TilePane) with this.


public class Main extends Application {

    private Stage primaryStage;
    Controller controller;
    Board board;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;

        //show the main window
        mainWindow();

        //fill the board
        fillBoard();

        //assign state to two cells;
        assignStates();
    }

    public void assignStates() {
        board.getCell(30,30).setCurrentState(1);
        board.getCell(29,31).setCurrentState(1);


        board.getCell(30,30).updateRec();
        board.getCell(29,31).updateRec();


    }

    public void fillBoard() {
        int a = (int) controller.getTilepane().getHeight()/10;
        int b = (int) controller.getTilepane().getWidth()/10;
        System.out.println(a+" "+b);

        board = new Board(a,b);

        controller.getTilepane().setPrefTileWidth(10);
        controller.getTilepane().setPrefTileHeight(10);


        for(int i = 0; i < board.getBoard().length; i++) {
            for(int j = 0; j < board.getBoard()[i].length; j++) {
                controller.getTilepane().getChildren().add(board.getCell(i,j).getRec());
            }
        }
    }


    public void mainWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("sample.fxml"));
            Parent root = loader.load();

            controller = loader.getController();
            controller.setMain(this);

            primaryStage.setMinWidth(850);
            primaryStage.setMinHeight(650);


            Scene myScene = new Scene(root);
            primaryStage.setScene(myScene);
            primaryStage.setTitle("Simulation");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    //starting point of application
    public static void main(String[] args) {
    launch(args);
    }
}

