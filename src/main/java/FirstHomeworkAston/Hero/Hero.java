package FirstHomeworkAston.Hero;

import FirstHomeworkAston.Enemy.Enemy;
import FirstHomeworkAston.Mortal;

public abstract class Hero implements Mortal {

    private String name;

    private int health;

    private int attackPower;

    public Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public boolean isAlive() {
        if (this.getHealth() > 0)
            return true;
        else return false;
    }

}
