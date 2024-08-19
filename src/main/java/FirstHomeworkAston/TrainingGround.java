package FirstHomeworkAston;

public class TrainingGround {
    public static void main(String[] args) {

        Enemy enemy = new Enemy(1000);

        Hero mage = new Mage("Dambldor");
        mage.attackEnemy(enemy);

        Hero warrior = new Warrior("Dart Mol");
        warrior.attackEnemy(enemy);

        Hero archer = new Archer("Legalas");
        archer.attackEnemy(enemy);



    }
}
