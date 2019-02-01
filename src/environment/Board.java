package environment;

import Agents.PredatorAgent;

/**
 * BlablathisandThat
 * dsa
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

