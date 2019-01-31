package environment;

//The cell contains our agent, agents can move independent from cells with a defined speed
//state based simulation


import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class Cell {

    private Rectangle rec;

    public Cell(){
        rec = new Rectangle(10,10,Color.WHITE);
        rec.setStroke(Color.BLACK);
    }

    public Rectangle getRec() {
        rec.setStroke(Color.BLACK);
        return rec;
    }
}
