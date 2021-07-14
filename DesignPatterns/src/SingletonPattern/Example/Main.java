package SingletonPattern.Example;

/**
 * @author yiqru
 * @date 2021/6/30 3:04 下午
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2) {
            System.out.println("s1与s2是相同的实例");
        } else {
            System.out.println("s1与s2是不同的实例");
        }
        System.out.println("End.");
    }
}
