package FirstHomeworkAston.Enemy;

public class Witch extends Enemy{

    public Witch(int health, int contrAttackPower) {
        super(health, contrAttackPower);
    }

    @Override
    public int takeDamage(int damage) {
        if (!this.isAlive()) {
            return 0;
        }
        this.setHealth(this.getHealth() - damage);
        return damage;
    }

}
