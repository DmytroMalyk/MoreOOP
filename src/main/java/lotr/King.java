package lotr;

import lotr.kickstrategy.NormalKick;

public class King extends Character{
    
    public King() {
        super(generateRandomAttribute(5, 15), generateRandomAttribute(5, 15), new NormalKick());
    }
}
