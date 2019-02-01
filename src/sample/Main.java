package sample;

import environment.Board;
import environment.EmptyCell;
import Agents.PredatorAgent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * BlablathisandThat
 * dsa
 * dsa
 * dsa
 * dsa
 *
 *
 * @author Ivo Bracharz
 * @version 1.0
 * @date 2019/01/20
 *
 */

public class Main extends Application
{
    private Stage primaryStage;
    private Controller controller;
    public Board board;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        this.primaryStage = primaryStage;

        //show the main window
        mainWindow();

        EmptyCell a = new PredatorAgent();
        
        //create emtpy board and add to view
        createBoard();

        updateBoard();
    }

    public void updateBoard()
    {
        board.updateCellPred(30,30);
       // controller.getTilePane().getChildren().add(iv);
    }

    public void createBoard()
    {
        int XDim = (int) controller.getTilePane().getHeight()/10;
        int YDim = (int) controller.getTilePane().getWidth()/10;

        board = new Board(XDim,YDim);

        controller.getTilePane().setPrefTileWidth(10);
        controller.getTilePane().setPrefTileHeight(10);


        for(int i = 0; i < board.getBoard().length; i++) {
            for(int j = 0; j < board.getBoard()[i].length; j++) {
                //TODO: why does getRec() work ? is method of abstract class cell, not EmptyCell()
                controller.getTilePane().getChildren().add(board.getCell(i,j).getThis());
            }
        }
        return;
    }

    public void calculateNextGeneration() {

        EmptyCell[][] nextGen = new EmptyCell[(int) controller.getTilePane().getWidth()/10][(int)controller.getTilePane().getHeight()/10];

        for (int i = 0; i < board.getBoard().length; i++) {
            for (int j = 0; j < board.getBoard()[i].length; j++) {


            }
        }
        //this.board.getCellArray() = nextGen;

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

    public void setStageSize()
    {
        primaryStage.setMinWidth(850);
        primaryStage.setMinHeight(650);
    }


    //starting point of application
    public static void main(String[] args)
    {
        launch(args);
    }
}