package FirstHomeworkAston;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Герой с именем - " + this.getName() + ", класса воин, атакует врага и наносит " + enemy.takeDamage(50) + " урона. Уровень здоровья врага - " + enemy.getHealth());
    }
}
