package AbstractFactoryPattern.Example.Factory;

import java.util.ArrayList;

/**
 * @author yiqru
 * @date 2021/11/17 4:03 下午
 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
