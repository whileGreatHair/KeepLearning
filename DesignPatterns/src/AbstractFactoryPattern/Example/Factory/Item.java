package AbstractFactoryPattern.Example.Factory;

/**
 * @author yiqru
 * @date 2021/11/17 4:00 下午
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
