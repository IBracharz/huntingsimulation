package environment;

//The cell contains our agent, agents can move independent from cells with a defined speed
//state based simulation


import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Cell extends AbstractCell {

    private int currentState = 0;
    private int nextState;


    public int getCurrentState() {
        return currentState;
    }

    public void setCurrentState(int currentState) {
        this.currentState = currentState;
    }

    //calculate the next state according to rules
    public void calulateNextState(){

    }

    @Override
    public Rectangle getRec(){
        Rectangle rec = new Rectangle(10,10, Color.BLACK);
        rec.setStroke(Color.BLACK);
        return rec;
    }
}
