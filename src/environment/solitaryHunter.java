package environment;


import javafx.scene.image.Image;

public class solitaryHunter extends AbstractPredator {

    private final static Image icon = new Image("environment/bear.jpeg");


    solitaryHunter(){
        super(100.0,1,15,5);

    }

    @Override
    public Image getIcon() {
        return icon;
    }

}
