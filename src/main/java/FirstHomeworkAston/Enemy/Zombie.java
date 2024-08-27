package FirstHomeworkAston.Enemy;

public class Zombie extends Enemy {
    public Zombie(int health, int contrAttackPower) {
        super(health, contrAttackPower);
    }

    @Override
    public int takeDamage(int damage) {

        this.setHealth(this.getHealth() - damage);

        if (!this.isAlive()) {
            double a = Math.random();
            if (a >= 0.5) {
                this.setHealth(1000);
                this.setHealth(this.getHealth() - damage);
                System.out.println("Zombie возродился с 1000 hp!");
                return damage;
            }
            return 0;
        }
        return damage;
    }


}
