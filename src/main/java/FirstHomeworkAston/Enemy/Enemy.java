package FirstHomeworkAston.Enemy;

import FirstHomeworkAston.Mortal;

public abstract class Enemy implements Mortal {

    private int health;

    private int contrAttackPower;

    public Enemy(int health, int contrAttackPower) {
        this.health = health;
        this.contrAttackPower = contrAttackPower;
    }

    public int getHealth() {
        return health;
    }

    public int getContrAttackPower() {
        return contrAttackPower;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract int takeDamage(int damage);

    @Override
    public boolean isAlive() {
        if (this.health > 0)
            return true;
        else return false;
    }
}
