package DesignPatterns.IteratorPattern;

public interface Iterator {
    /**
     * 判断元素集合是否存在下一个元素
     * @return 是否存在
     */
    public abstract boolean hasNext();

    /**
     * 获取下一个元素并且指向下一个元素
     * @return 元素对象
     */
    public abstract Object next();
}
