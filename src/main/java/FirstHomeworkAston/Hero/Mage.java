package FirstHomeworkAston.Hero;

import FirstHomeworkAston.Enemy.Enemy;

public class Mage extends Hero {

    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (this.isAlive() || enemy.isAlive()) {
            this.setHealth(this.getHealth() - enemy.getContrAttackPower());
            System.out.println("Герой с именем - " + this.getName() + ", класса маг, атакует врага и наносит " + enemy.takeDamage(this.getAttackPower()) + " урона. Уровень здоровья врага - " + enemy.getHealth() +
                    ". Герой получает в контратаке от врага - " + enemy.getContrAttackPower() + " урона. Уровень здоровья мага - " + this.getHealth());
        }
        if (!this.isAlive())
            System.out.println("Маг мертв");
        if (!enemy.isAlive())
            System.out.println("Враг мертв");
    }
}
