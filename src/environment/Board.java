/*
 *Template for our environment, represents the CA
 *
 *
 *
 *
 */
package environment;

public class Board {

    Cell cells[][] = new Cell[3][3];

    private int BOARD_WIDTH=3;
    private int BOARD_HEIGHT=3;

    //don't know if generate is supposed to be here ~ trying to implement MVC Design Pattern
    public void generate(){
        /*
        for(int i = 0; i < BOARD_HEIGHT; i++) {
            for(int j = 0; j < BOARD_WIDTH; j++) {

            }
        }
        */

    }
    //getter and setter for board width
    public int getBOARD_WIDTH() {
        return BOARD_WIDTH;
    }

    public void setBOARD_WIDTH(int BOARD_WIDTH) {
        this.BOARD_WIDTH = BOARD_WIDTH;
    }

    //getter and setter for board height
    public int getBOARD_HEIGHT() {
        return BOARD_HEIGHT;
    }

    public void setBOARD_HEIGHT(int BOARD_HEIGHT) {
        this.BOARD_HEIGHT = BOARD_HEIGHT;
    }


    Board(){

    }


}
