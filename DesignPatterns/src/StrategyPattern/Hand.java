package StrategyPattern;

/**
 * @date 2021/11/29 5:39 下午
 * 表示猜拳游戏中的"手势"类
 */
public class Hand {
    public static final Integer HANDVALUE_GUU = 0;      //表示石头的值
    public static final Integer HANDVALUE_CHO = 1;      //表示剪刀的值
    public static final Integer HANDVALUE_PAA = 2;      //表示布的值
    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA),
    };

    private static final String[] name = {              //表示猜拳手势所对应的字符串
            "石头","剪刀","布"
    };

    private final int handValue;                        //猜拳中出的手势的值

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue){
        return hand[handValue];
    }

    public Boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public Boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name[handValue];
    }
}
