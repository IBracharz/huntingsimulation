package environment;

import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;

public class PackHunter extends AbstractPredator {

    private final static Image icon = new Image("environment/wolf.png");

    PackHunter() {
        super(80.0, 3,8,3);

    }

    public void move(){

    }


    @Override
    public Image getIcon(){
        return icon;
    }


}
