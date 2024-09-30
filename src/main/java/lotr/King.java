package lotr;

import lotr.kickstrategy.NormalKick;

public class King extends Character{
    
    public King() {
        super(generateRandomAttribute(5, 10), generateRandomAttribute(5, 10), new NormalKick());
    }
}
