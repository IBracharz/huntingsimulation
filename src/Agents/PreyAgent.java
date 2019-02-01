package Agents;

import javafx.scene.paint.Color;

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
