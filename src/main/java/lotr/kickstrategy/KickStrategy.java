package lotr.kickstrategy;

import lotr.Character;

public interface KickStrategy {
    public abstract void kick(Character whoKicks, Character whoIsKicked);
}
