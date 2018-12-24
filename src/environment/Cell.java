package environment;

public class Cell {

    private int height = 10;
    private int width = 10;
    private int state;

    Cell(){

    }

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public int getSize() { return height*width; }
}
