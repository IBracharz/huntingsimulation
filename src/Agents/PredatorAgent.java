package Agents;

import javafx.scene.paint.Color;

/**
 * @version 1.0
 * @author Ivo Bracharz
 * @see PredatorAgent
 *
 * @date 2019/01/20
 *
 *The PredaorAgent class is one specification of the AbstractAgent class.
 *It defines the members and behavour one of our Agents has.
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
