package AbstractFactoryPattern.Example.Factory;

/**
 * @author yiqru
 * @date 2021/11/17 4:01 下午
 */
public abstract class Link extends Item{
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
