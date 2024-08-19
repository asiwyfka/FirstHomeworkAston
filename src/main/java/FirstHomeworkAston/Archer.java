package FirstHomeworkAston;

public class Archer extends Hero {


    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Герой с именем - " + this.getName() + ", класса лучник, атакует врага и наносит " + enemy.takeDamage(20) + " урона. Уровень здоровья врага - " + enemy.getHealth());
    }
}
