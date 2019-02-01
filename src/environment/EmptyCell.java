package environment;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

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

public class EmptyCell extends Rectangle {

    boolean isEmtpy = true;

    public EmptyCell()
    {
        setHeight(10);
        setWidth(10);
        setFill(Color.WHITE);
        setStroke(Color.BLACK);
    }

    public EmptyCell getThis()
    {
        return this;
    }

    public boolean isEmtpy(){
        return this.isEmtpy;
    }
}
