package sample;

import environment.Board;
import environment.Cell;
import environment.PackHunter;
import environment.solitaryHunter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.io.IOException;

/*
TODO: implement boundarys
TODO: implement "next Iteration Button"
 */


public class Main extends Application {

    private Stage primaryStage;
    private Controller controller;
    public Board board;


    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;

        //show the main window
        mainWindow();

        //create emtpy board and add to view
        createBoard();

        //fillHuntingPopulation();
       // fillPreyPopulation();

    }

    public void updateBoard(){

        for(int i = 0; i < board.getBoard().length; i++) {
            for(int j = 0; j < board.getBoard()[i].length; j++) {
                if(board.getCell(i,j).getClass().toString()=="environment.PackHunter") {
                   //ImageView img = board.getCell(i,j)

                }
            }
        }

    }

    /*
    public void fillHuntingPopulation(){
        Cell a = board.getCell(30,30);
        a = new solitaryHunter();

        return;

    }
    public void fillPreyPopulation(){

    }
*/

/*
    //assignes random states between 0 and 6 to cells and updates their colour
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

    public void clearCells() {
        for(int i = 1; i < board.getBoard().length; i++) {
            for (int j = 1; j < board.getBoard()[i].length; j++) {
                board.getCell(i, j).setCurrentState(0);
                board.getCell(i, j).updateRec();
            }
        }
        return;
    }
*/


    public void createBoard() {
        int XDim = (int) controller.getTilePane().getHeight()/10;
        int YDim = (int) controller.getTilePane().getWidth()/10;

        board = new Board(XDim,YDim);

        controller.getTilePane().setPrefTileWidth(10);
        controller.getTilePane().setPrefTileHeight(10);


        for(int i = 0; i < board.getBoard().length; i++) {
            for(int j = 0; j < board.getBoard()[i].length; j++) {
                //TODO: why does getRec() work ? is method of abstract class cell, not EmptyCell()
                controller.getTilePane().getChildren().add(board.getCell(i,j).getRec());
            }
        }
        return;
    }

    public void calculateNextGeneration() {

        Cell[][] nextGen = new Cell[(int) controller.getTilePane().getWidth()/10][(int)controller.getTilePane().getHeight()/10];

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

    public void setStageSize(){

        primaryStage.setMinWidth(850);
        primaryStage.setMinHeight(650);
    }


    //starting point of application
    public static void main(String[] args) {

        launch(args);
    }
}