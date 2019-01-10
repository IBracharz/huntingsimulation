/*
Our Cellular system needs the basic ingredients
1. Assign the cellular space. 3 by 3
2. Assign the time variable.
3. Assign the neighborhood.
4. Assign the state set.
5. Assign the transition rule.
6. Assign the boundary conditions.
7. Assign the initial condition.
8. Assign a stopping condition.
9. Proceed to update the state of
the cells until the stopping condition
is met.
 */

package environment;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


//TODO:Check if board is programmed right
public class Board {

    private Cell[][] cells = new Cell[30][30];

    public Board(){
    }

    public void initBoard(){

        for (int i = 0; i < this.cells.length; i++) {
            for (int j = 0; j < this.cells[i].length; j++) {
                this.cells[i][j] = new Cell();
            }
        }
        return;
    }

    public Rectangle drawBoard(){

        Rectangle rec = new Rectangle(10,10, Color.WHITE);
        rec.setStroke(Color.BLACK);

        for (int i = 0; i < this.cells.length; i++) {
            for (int j = 0; j < this.cells[i].length; j++) {
                return rec;
            }
        }
        return rec;
    }
    public Cell[] getCellarray() {
        return this.cells[0];
    }

    public Cell[][] getCells(){
        return this.cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }
}
