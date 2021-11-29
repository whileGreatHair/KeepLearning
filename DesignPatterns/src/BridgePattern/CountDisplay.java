package BridgePattern;

/**
 * @date 2021/11/29 3:21 下午
 * 类的功能层次结构
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

}
