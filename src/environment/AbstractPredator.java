package environment;

import javafx.scene.image.Image;

import java.beans.Visibility;

public abstract class AbstractPredator extends Cell {


    private double health;
    private int speed;
    private int visibilityRadius;
    private int attack;

    AbstractPredator(double health, int speed, int visibilityRadius, int attack)
    {
        this.health = health;
        this.speed = speed;
        this.visibilityRadius = visibilityRadius;
        this.attack = attack;
    }


    protected abstract Image getIcon();


    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getVisibilityRadius() {
        return visibilityRadius;
    }

    public void setVisibilityRadius(int visibilityRadius) {
        this.visibilityRadius = visibilityRadius;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }



}
