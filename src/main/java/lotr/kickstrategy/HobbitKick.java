package lotr.kickstrategy;

import lotr.Character;

public class HobbitKick implements KickStrategy{

    @Override
    public void kick(Character whoKicks, Character whoIsKicked) {
        System.out.println("*crying");
    }
    
}
