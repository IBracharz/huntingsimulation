/*
*
*
*
*
*
*
 */
package sample;

import environment.*;

import environment.Cell;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.xml.soap.Text;

public class Main extends Application {


    //starting point of application
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Simulation");

        //-----------------------Main Pane----------------------------//
        BorderPane pane = new BorderPane();

        //----------------------Statistics and Input------------------//
        SplitPane rightPane =  new SplitPane();

        //Statistics Pane
        VBox statPane = new VBox();
        Label statLabel = new Label("Statstics");

        statPane.getChildren().add(statLabel);

        //Input Pane
        VBox inputPane = new VBox();
        Label inputLabel = new Label("Inputs");

        TextField textOne = new TextField("X by Y Cells");
        TextField textTwo = new TextField("No. of hunters");
        TextField textThree = new TextField("No. of prey");

        inputPane.getChildren().addAll(inputLabel,textOne,textTwo,textThree);


        rightPane.getItems().addAll(statPane,inputPane);
        rightPane.setOrientation(Orientation.VERTICAL);
        rightPane.setDividerPosition(1,0.5);


        TextField text1= new TextField("");

        //----------------------Simulation Pane----------------------//

        TilePane centerPane = new TilePane();

        Board board = new Board();

        board.initBoard();


        for(Cell[] a: board.getCells()){
            for(Cell elem: board.getCellarray()){
                centerPane.getChildren().add(board.drawBoard());
            }
        }


        //-------------------Simulation Control Pane-------------------//
        HBox bottomPane = new HBox();

        //button to start simulation
        Button startButton = new Button("Start");
        startButton.setOnAction(event -> {

        });

        //Button to pause Simulation
        Button pauseButton = new Button("Pause");
        startButton.setOnAction(event -> {

        });

        Button iterateButton = new Button("Next Gen");
        startButton.setOnAction(event -> {

        });

        Button stopButton = new Button("Stop");


        bottomPane.getChildren().addAll(startButton,pauseButton,iterateButton,stopButton);

        //------------------------Putting Panes Together--------------------//

        pane.setCenter(centerPane);
        pane.setRight(rightPane);
        pane.setBottom(bottomPane);


        Scene scene = new Scene(pane,330,250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

//entire window = stage
//content inside window = scene | need more than one scene.



        /*    primaryStage.setTitle("Hunting Simulator");
        //underlying pane for everything
        AnchorPane root = new AnchorPane();
        AnchorPane field = new AnchorPane();



        Button startButton = new Button("Start");
        Button stopButton = new Button("Stop");
        Button iterateButton= new Button("Next Iteration");

        SplitPane statAndInputRoot = new SplitPane(startButton,stopButton,iterateButton);

        root.getChildren().addAll(field,statAndInputRoot);




        Scene scene = new Scene(root, 300,250, Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}


        //load image
        Image image = new Image("images/rabbit.jpeg",true);

        ImageView iv1 = new ImageView();
        iv1.setImage(image);

              pane.getChildren().add(iv1);
        */        //Start Button

    /*
    this is how lamba expressions work are used
        Button startButton = new Button("Start");
        startButton.setOnAction(event -> { //LAMBDA EXPRESSION!
                window.setScene(simulationScene);
                });

                        //whenever X is hit call our close method
        window.setOnCloseRequest(event -> {
            event.consume();
            closeProgram();
        });
*/