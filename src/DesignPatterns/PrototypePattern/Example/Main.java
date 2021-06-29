package DesignPatterns.PrototypePattern.Example;

import DesignPatterns.PrototypePattern.Example.framework.Manager;
import DesignPatterns.PrototypePattern.Example.framework.Product;

public class Main {
    public static void main(String[] args) {
        //准备
        Manager manager = new Manager();
        UnderlinePen uPen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", uPen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);
        //生成
        Product p1 = manager.create("strong message");
        p1.use("Hello,world");
        Product p2 = manager.create("warning box");
        p2.use("Hello,world");
        Product p3 = manager.create("slash box");
        p3.use("Hello,world");

        Product p4 = manager.create("warning box");
        p4.use("你好，时间");

    }
}
