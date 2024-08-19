package FirstHomeworkAston;

public class Enemy implements Mortal {

    private int health;


    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public int takeDamage(int damage) {
        if (!this.isAlive()) {
            System.out.println("Enemy мертв");
            return 0;
        }
        this.health = this.health - damage;
        return damage;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
