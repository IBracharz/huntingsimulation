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
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));

        // get the controller
        Controller controller = new Controller();

        //declare and initialize board
        Board board = new Board(100,100);

        for(int i = 0; i < board.getBoard().length; i++) {
            for(int j = 0; j < board.getBoard()[i].length; j++) {
                controller.getCenterPane().getChildren().add(board.getCell(i,j).getRec());
            }
        }

        //System.out.println(board.getCell(1,1).getRec());

        //

        //Build new scene from root node.
        primaryStage.setScene(new Scene(root,800,600));
        primaryStage.setTitle("Simulation");
        primaryStage.show();
    }

    //starting point of application
    public static void main(String[] args) {

    launch(args);

    }
}

