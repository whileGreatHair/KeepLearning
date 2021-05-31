package DesignPatterns.AdapterPattern.EntrustAdapter;


public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("hhh");
        p.printWeak();
        p.printStrong();
    }
}
