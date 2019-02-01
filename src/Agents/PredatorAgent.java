package Agents;

import javafx.scene.paint.Color;

/**
 * The PredaorAgent class is one specification of the AbstractAgent class.
 * It defines the members and behaviour one of our Agents has.
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

public class PredatorAgent extends AbstractAgent {

    private Color color = Color.CHOCOLATE;
    private double health;


    public PredatorAgent(){
        super(100.0,5,10,5);
        super.setFill(this.getColor());
    }

    public Color getColor() {
        return color;
    }



}
