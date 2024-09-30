package lotr;

import lotr.kickstrategy.NormalKick;

public class Knight extends Character{
    
    public Knight() {
        super(generateRandomAttribute(2, 10), generateRandomAttribute(2, 10), new NormalKick());
    }
}
