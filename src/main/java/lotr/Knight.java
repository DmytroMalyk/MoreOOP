package lotr;

import lotr.kickstrategy.NormalKick;

public class Knight extends Character{
    
    public Knight() {
        super(generateRandomAttribute(2, 12), generateRandomAttribute(2, 12), new NormalKick());
    }
}
