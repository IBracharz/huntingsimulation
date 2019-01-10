package agents;

abstract class AutonomousAgent {

    //TODO: find out how to program intelligent agents

    private int age;
    private int health;
    private int energy;
    private int maturity;
    private int offspringCount;
    private int assignedState;


    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected int getHealth() {
        return health;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    protected int getEnergy() {
        return energy;
    }

    protected void setEnergy(int energy) {
        this.energy = energy;
    }

    protected int getMaturity() {
        return maturity;
    }

    protected void setMaturity(int maturity) {
        this.maturity = maturity;
    }

    protected int getOffspringCount() {
        return offspringCount;
    }

    protected void setOffspringCount(int offspringCount) {
        this.offspringCount = offspringCount;
    }



}
