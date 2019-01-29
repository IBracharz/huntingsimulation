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
    @FXML private Button populateAutomatonButton;

    public void setMain(Main main) {
        this.main = main;
    }


    public BorderPane getRoot() {
        return root;
    }

    public TilePane getTilePane() {
        return tilepane;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    public void handleNextIteration(){
        System.out.println("buuton geht");
        main.calculateNextGeneration();

    }

    @FXML
    public void handleStart() {
    }

    @FXML
    public void populateAutomaton(){
        main.createInitPopulation();
    }
}
