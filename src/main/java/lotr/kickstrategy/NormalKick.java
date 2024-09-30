package lotr.kickstrategy;

import java.util.Random;

import lotr.Character;

public class NormalKick implements KickStrategy{
    private static final Random random = new Random();
    
    @Override
    public void kick(Character whoKicks, Character whoIsKicked) {
        whoIsKicked.setHp(whoIsKicked.getHp() - random.nextInt(whoKicks.getPower()));
    }
}
