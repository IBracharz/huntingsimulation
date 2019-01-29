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


    public void setCurrentState(int currentState) {
        this.currentState = currentState;
    }

    //calculate the next state according to rules
    public void calulateNextState(){

    }

    public void updateRec(){
        if(currentState==0){
            rec.setFill(Color.WHITE);
        }
        else if(currentState==1){
            rec.setFill(Color.BLUE);
        }
        else if(currentState==2){
            rec.setFill(Color.YELLOW);
        }
        else if(currentState==3){
            rec.setFill(Color.BROWN);
        }
        else if(currentState==4){
            rec.setFill(Color.BLACK);
        }
        else if(currentState==5){
            rec.setFill(Color.RED);
        }
        return;
    }

    public void setVisibilityRadius() {
        if(this.currentState==1) {
            this.visibilityRadius = 3;
        }
    }

    public Rectangle getRec() {
        return rec;
    }

    public void setNextState(int nextState) {
        this.nextState = nextState;
    }

    public int getNextState() {
        return nextState;
    }

    public int getCurrentState() {
        return currentState;
    }

    public void ChangeState(){
        currentState = nextState;
        updateRec();
        nextState=0;
    }


}
