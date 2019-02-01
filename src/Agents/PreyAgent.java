package Agents;

import javafx.scene.paint.Color;

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

public class PreyAgent extends AbstractAgent {

    private Color color = Color.BLUE;

    public PreyAgent(){
        super(50,0,0,0);
        setFill(this.getColor());
    }

    public Color getColor() {
        return color;
    }
}
