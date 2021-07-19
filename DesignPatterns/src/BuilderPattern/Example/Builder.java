package BuilderPattern.Example;

/**
 * @author yiqru
 * @date 2021/7/16 4:43 下午
 */
public abstract class Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();
}
