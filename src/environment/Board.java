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

import Agents.PredatorAgent;

public class Board
{

    //declare board reference
    private EmptyCell[][] cellArray;

    //construct board with fixed size
    public Board(int n, int m)
    {
        //reserve memory for size of n*m emptyCell objects
        cellArray = new EmptyCell[n][m];

        // create Cell object in each element of board
        for (int i = 0; i < cellArray.length; i++) {
            for (int j = 0; j < cellArray[i].length; j++) {
                this.cellArray[i][j] = new EmptyCell();
            }
        }
    }

    public EmptyCell getCell(int n, int m)
    {
        return this.cellArray[n][m];
    }

    public EmptyCell[][] getBoard()
    {
        return this.cellArray;
    }

    public void updateCellPred(int a, int b){
        this.cellArray[a][b] = new PredatorAgent();
        System.out.println(this.cellArray[a][b]);
    }

}

