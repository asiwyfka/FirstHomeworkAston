package FirstHomeworkAston;

public class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Герой с именем - " + this.getName() + ", класса маг, атакует врага и наносит " + enemy.takeDamage(70) + " урона. Уровень здоровья врага - " + enemy.getHealth());
    }
}
