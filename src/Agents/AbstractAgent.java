package Agents;

import environment.EmptyCell;

/**
 *
 * @version 1.0
 * @author Ivo Bracharz
 * @see Agents.AbstractAgent
 * @see
 */

public abstract class AbstractAgent extends EmptyCell {

    private String name;
    private int speed;
    private int visibilityRadius;
    private int attack;


    AbstractAgent(double health, int speed, int visibilityRadius, int attack)
    {
        this.setSpeed(speed);
        this.setVisibilityRadius(visibilityRadius);
        this.setAttack(attack);
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
