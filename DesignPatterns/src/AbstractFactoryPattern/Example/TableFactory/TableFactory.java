package AbstractFactoryPattern.Example.TableFactory;

import AbstractFactoryPattern.Example.Factory.Factory;
import AbstractFactoryPattern.Example.Factory.Link;
import AbstractFactoryPattern.Example.Factory.Page;
import AbstractFactoryPattern.Example.Factory.Tray;

/**
 * @author yiqru
 * @date 2021/11/17 5:19 下午
 */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
