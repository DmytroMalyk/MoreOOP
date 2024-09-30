package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Once uppon the time in the lotr universe, there was a brutal fight between " + 
    c1.getClass().getName().replace("lotr.", "") + " with " + c1.getHp() + " hp and " +
    c1.getPower() + " power units " + " and " + 
    c2.getClass().getName().replace("lotr.", "") + " with " + c2.getHp() + " hp and " +
    c2.getPower() + " power units ");
        boolean turn = true;
        Character kicker = c1;
        Character gotKicked = c2;
        while (c1.isAlive() && c2.isAlive()) {
            if (turn) {
                kicker = c1;
                gotKicked = c2;
            } else {
                kicker = c2;
                gotKicked = c1;
            }
            int before_life = gotKicked.getHp();
            kicker.kick(gotKicked);
            int after_life = gotKicked.getHp();
            if (after_life != before_life) {
                System.out.println(kicker.getClass().getName().replace("lotr.", "") + 
    " kicked his opponent dealing " + (before_life - after_life) + " points of damage");
            }
            turn = !turn;
        }
        System.out.println(kicker.getClass().getName().replace("lotr.", "") + 
    " won by kicking his opponent to death... interesting strategy.");
    }
}
