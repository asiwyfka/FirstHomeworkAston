package FirstHomeworkAston.Hero;

import FirstHomeworkAston.Enemy.Enemy;

public class Warrior extends Hero {
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (this.isAlive() || enemy.isAlive()) {
            this.setHealth(this.getHealth() - enemy.getContrAttackPower());
            System.out.println("Герой с именем - " + this.getName() + ", класса воин, атакует врага и наносит " + enemy.takeDamage(this.getAttackPower()) + " урона. Уровень здоровья врага - " + enemy.getHealth() +
                    ". Герой получает в контратаке от врага - " + enemy.getContrAttackPower() + " урона. Уровень здоровья воина - " + this.getHealth());
        }
        if (!this.isAlive())
            System.out.println("Воин мертв");
        if (!this.isAlive())
            System.out.println("Враг мертв");
    }
}
