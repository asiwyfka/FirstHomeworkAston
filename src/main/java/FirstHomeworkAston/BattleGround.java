package FirstHomeworkAston;

import FirstHomeworkAston.Enemy.Enemy;
import FirstHomeworkAston.Enemy.Zombie;
import FirstHomeworkAston.Hero.Hero;
import FirstHomeworkAston.Hero.Mage;

public class BattleGround {

    public static void main(String[] args) {

        Enemy zombie = new Zombie(100, 10);

        Hero mage = new Mage("Dambldor", 50, 30);

        for (int i = 0; i <= 5; i++) {
            if (mage.isAlive() && zombie.isAlive())
                mage.attackEnemy(zombie);
        }
    }
}
