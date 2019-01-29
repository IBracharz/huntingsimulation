package sample;

import environment.Board;
import environment.Cell;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
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


    }

    public void createInitPopulation() {
        for(int i = 1; i < board.getBoard().length; i++) {
            for (int j = 1; j < board.getBoard()[i].length; j++) {
                int A = (int) (Math.random()*6+1);
                board.getCell(i, j).setCurrentState((int) (Math.random() * 6 ));
                board.getCell(i, j).updateRec();
            }
        }
        return;
     }

    public void fillBoard() {
        int a = (int) controller.getTilePane().getHeight()/10;
        int b = (int) controller.getTilePane().getWidth()/10;

        board = new Board((int) controller.getTilePane().getWidth()/10,(int)controller.getTilePane().getHeight()/10);

        controller.getTilePane().setPrefTileWidth(10);
        controller.getTilePane().setPrefTileHeight(10);


        for(int i = 0; i < board.getBoard().length; i++) {
            for(int j = 0; j < board.getBoard()[i].length; j++) {
                controller.getTilePane().getChildren().add(board.getCell(i,j).getRec());
            }
        }
    }

    public void calculateNextGeneration() {

        Cell[][] nextGen = new Cell[(int) controller.getTilePane().getWidth()/10][(int)controller.getTilePane().getHeight()/10];

        for (int i = 1; i < board.getBoard().length - 1; i++) {
            for (int j = 1; j < board.getBoard()[i].length - 1; j++) {


            }
        }
        this.board.getCellArray() = nextGen;

        return;
    }

    public void mainWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("sample.fxml"));
            Parent root = loader.load();

            controller = loader.getController();
            controller.setMain(this);

            setStageSize();

            Scene myScene = new Scene(root);
            primaryStage.setResizable(false);
            primaryStage.setScene(myScene);
            primaryStage.setTitle("Simulation");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void setStageSize(){

        primaryStage.setMinWidth(850);
        primaryStage.setMinHeight(650);
    }


    //starting point of application
    public static void main(String[] args) {
    launch(args);
    }
}

