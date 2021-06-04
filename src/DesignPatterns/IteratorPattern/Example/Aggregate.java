package DesignPatterns.IteratorPattern.Example;

/**
 * 所要遍历的集合接口。
 * 实现该接口的类将成为一个可以保存多个元素的集合。
 */
public interface Aggregate {
    Iterator iterator();
}
