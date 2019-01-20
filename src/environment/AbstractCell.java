package environment;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class AbstractCell {

    protected Rectangle rec = new Rectangle(10,10, Color.WHITE);


    protected Rectangle getRec(){

        rec.setStroke(Color.BLACK);
        return  rec;

    }
}
