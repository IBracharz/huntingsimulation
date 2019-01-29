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


/*
board lifecycle:
1.at start of application create and init the board
2.update board each iteration
3.delete board when application closes.


 */


package environment;

public class Board {

    private Cell[][] cells;


    //Default constructor
    Board(){
    }

    //parameterized constructor
    public Board(int n, int m){
        this.cells = new Cell[n][m];

        // create Cell object in each element of board
        for (int i = 0; i < cells.length; i++) {
            for(int j = 0; j  < cells[i].length; j++){
                this.cells[i][j] = new Cell();
            }
        }
    }

    public Cell getCell(int n, int m){
        return this.cells[n][m];
    }

    public Cell[][] getBoard() {
        return cells;
    }

    public Cell[][] getCellArray(){
        return this.cells;
    }


}

