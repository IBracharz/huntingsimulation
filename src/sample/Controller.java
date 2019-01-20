package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.*;

public class Controller {

    @FXML
    private BorderPane root = new BorderPane();

    public BorderPane getRoot() {
        return root;
    }

    @FXML
    private TilePane centerPane = new TilePane();

    public TilePane getCenterPane() {
        return centerPane;
    }

    public void setCenterPane(TilePane centerPane) {
        this.centerPane = centerPane;
    }

    @FXML
    private HBox bottomPane= new HBox() ;

    @FXML
    private VBox topVBox = new VBox();

    @FXML
    private VBox bottomVBox = new VBox();

}
