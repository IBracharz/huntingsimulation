package environment;

import agents.*;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Cell {

    //TODO: finish cell programming

    private int state;

    Rectangle drawRec() {
        Rectangle rec = new Rectangle(10, 10, Color.BLACK);
        rec.setStroke(Color.BLACK);

        return rec;
    }

    private int nextState;

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}



/*
        if(this.state==0){

                }
                else if (this.state==1){
                rec.setFill(Color.BROWN);
                }
                else if (this.state==2){
                rec.setFill(Color.GREEN);
                }
                else if (this.state==3) {
                rec.setFill(Color.BLUE);
                }
                else if (this.state==4){
                rec.setFill(Color.YELLOW);
                }
                else
                {
                rec.setFill(Color.RED);
                }
                return rec;

                }
*/