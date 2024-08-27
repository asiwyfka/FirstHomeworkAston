package FirstHomeworkAston.Hero;

import FirstHomeworkAston.Enemy.Enemy;

public class Archer extends Hero {

    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (this.isAlive() || enemy.isAlive()) {
            this.setHealth(this.getHealth() - enemy.getContrAttackPower());
            System.out.println("Герой с именем - " + this.getName() + ", класса лучник, атакует врага и наносит " + enemy.takeDamage(this.getAttackPower()) + " урона. Уровень здоровья врага - " + enemy.getHealth() +
                    ". Герой получает в контратаке от врага - " + enemy.getContrAttackPower() + " урона. Уровень здоровья лучника - " + this.getHealth());
        }
        if (!this.isAlive())
            System.out.println("Лучник мертв");
        if (!this.isAlive())
            System.out.println("Враг мертв");
    }
}
