package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    public Main main;
    @FXML private BorderPane root;
    @FXML private TilePane tilepane;
    @FXML private Button nextIteration;
    @FXML private Button startButton;



    public void setMain(Main main) {
        this.main = main;
    }


    public BorderPane getRoot() {
        return root;
    }

    public TilePane getTilepane() {
        return tilepane;
    }

    public void setNextIteration(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      //  startButton.setOnAction(event -> {
          //  initBoard();
       // }
    }

    @FXML
    public void handleNextIteration(){
        //calculateNewStates();
        //updateCellColours();



        System.out.println("buuton geht");

    }

    @FXML
    public void handleStart() {

        main.createInitPopulation();

    }


}
