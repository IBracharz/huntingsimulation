package environment;

//The cell contains our agent, agents can move independent from cells with a defined speed
//state based simulation


import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Cell {

    private int currentState = 0;
    private int nextState;
    private Rectangle rec;
    private double visibilityRadius;

    public Cell(){
        rec = new Rectangle(10,10,Color.WHITE);
        rec.setStroke(Color.BLACK);
    }

    public int getCurrentState() {
        return currentState;
    }

    public void setCurrentState(int currentState) {
        this.currentState = currentState;
    }

    //calculate the next state according to rules
    public void calulateNextState(){

    }

    public void updateRec(){
        if(currentState==1){
            rec.setFill(Color.BLUE);
        }
    }

    public void setVisibilityRadius() {
        if(this.currentState==1) {
            this.visibilityRadius = 3;
        }
    }

    public Rectangle getRec(){
        return rec;
    }
}
