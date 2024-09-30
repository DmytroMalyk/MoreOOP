package lotr.kickstrategy;

import lotr.Character;

public class ElfKick implements KickStrategy{

    @Override
    public void kick(Character whoKicks, Character whoIsKicked) {
        if (whoIsKicked.getPower() < whoKicks.getPower()) {
            whoIsKicked.setHp(0);
        } else {
            whoIsKicked.setPower(whoIsKicked.getPower()-1);
        }
    }
    
}
