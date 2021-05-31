package DesignPatterns.AdapterPattern.ExtendAdapter;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("电压转化");
        p.printWeak();
        p.printStrong();
    }
}
