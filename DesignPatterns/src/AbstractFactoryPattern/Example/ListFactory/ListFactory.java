package AbstractFactoryPattern.Example.ListFactory;

import AbstractFactoryPattern.Example.Factory.Factory;
import AbstractFactoryPattern.Example.Factory.Link;
import AbstractFactoryPattern.Example.Factory.Page;
import AbstractFactoryPattern.Example.Factory.Tray;

/**
 * @author yiqru
 * @date 2021/11/17 4:41 下午
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
