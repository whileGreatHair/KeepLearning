package StrategyPattern;

/**
 * @date 2021/11/30 10:35 上午
 * main
 */
public class Main {
    public static void main(String[] args) {
        //这里简化的原程序：原程序seed作为运行参数传入，这里写死了。
        Player p1 = new Player("Taro", new WinningStrategy(314));
        Player p2 = new Player("Hana", new WinningStrategy(15));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = p1.nextHand();
            Hand nextHand2 = p2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + p1);
                p1.win();
                p2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner:" + p2);
                p1.lose();
                p2.win();
            } else {
                System.out.println("Even...");
                p1.even();
                p2.even();
            }
        }

        System.out.println("Total result:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}
