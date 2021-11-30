package StrategyPattern;

import java.util.Random;

/**
 * @date 2021/11/30 9:46 上午
 */
public class WinningStrategy implements Strategy {
    private Random random;
    private Boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
