package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * das
 * dsa
 * dsa
 * dsa
 * das
 * dsa
 *
 * @author  Ivo Bracharz
 * @version 1.0
 * @date    2019/01/20
 *
 */

public class Controller implements Initializable {

    //create main object to access methods in that class
    private Main main;
    @FXML private BorderPane root;
    @FXML private TilePane tilepane;
    @FXML private Button nextIteration;
    @FXML private Button startButton;
    @FXML private Button populateAutomatonButton;

    public void setMain(Main main)
    {
        this.main = main;
    }

    public BorderPane getRoot()
    {
        return root;
    }

    public TilePane getTilePane()
    {
        return tilepane;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    public void handleNextIteration() {
        System.out.println("buuton geht");
        main.calculateNextGeneration();

    }

    @FXML
    public void handleStart()
    {
    }

    @FXML
    public void populateAutomaton()
    {
        //main.createFirstGeneration();
    }

    @FXML
    public void handleClearCells(){
      //  main.clearCells();
    }

    @FXML
    public void handlehOne()
    {
    }

    @FXML
    public void handlehTwo()
    {

    }

    @FXML
    public void handleSolitaryHunterColor()
    {

    }

    @FXML
    public void handlePackHunterColor()
    {

    }

    @FXML
    public void handleSmallPreyColor()
    {

    }

    @FXML
    public void handleMediumPreyColor()
    {

    }

    @FXML
    public void handleLargePreyColor()
    {

    }


}
