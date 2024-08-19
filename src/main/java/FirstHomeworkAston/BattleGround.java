package FirstHomeworkAston;

public class BattleGround {

    public static void main(String[] args) {

        Enemy enemy = new Enemy(1000);

        Hero mage = new Mage("Dambldor");

        for (int i = 0; i < 20; i++) {
            if (!enemy.isAlive()){
                System.out.println("Enemy мертв");
                break;}
            mage.attackEnemy(enemy);
        }


    }
}
