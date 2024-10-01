package lotr;

import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lotr.kickstrategy.KickStrategy;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickStrategy;
    protected static final Random random = new Random();

    public void kick(Character c) {
        kick(this, c, getKickStrategy());
    }

    public void kick(Character whoKicks, Character whoIsKicked, KickStrategy kickStrategy) {
        kickStrategy.kick(whoKicks, whoIsKicked);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = hp > 0? hp : 0;
    }

    protected static int generateRandomAttribute(int base, int range) {
        return random.nextInt(range - base) + base;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
