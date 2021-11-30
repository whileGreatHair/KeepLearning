package StrategyPattern;

import java.util.Random;

/**
 * @author yiqru
 * @date 2021/11/30 9:50 上午
 */
public class ProbStartegy implements Strategy {
    private Random random;
    private Integer preHandValue = 0;
    private Integer currentHandValue = 0;
    private Integer[][] history = {
            {1, 1, 1,},
            {1, 1, 1,},
            {1, 1, 1,},
    };

    public ProbStartegy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handValue = 0;
        if (bet < history[currentHandValue][0]) {
            handValue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }
        preHandValue = currentHandValue;
        currentHandValue = handValue;
        return Hand.getHand(handValue);
    }

    private int getSum(Integer hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[preHandValue][currentHandValue]++;
        } else {
            history[preHandValue][(currentHandValue + 1) % 3]++;
            history[preHandValue][(currentHandValue + 2) % 3]++;
        }

    }
}
