package StrategyPattern;

/**
 * @date 2021/11/30 9:37 上午
 * 猜拳策略的抽象方法的接口
 */
public interface Strategy {
    public abstract Hand nextHand();

    public abstract void study(boolean win);
}
