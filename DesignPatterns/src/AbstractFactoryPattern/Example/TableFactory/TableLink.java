package AbstractFactoryPattern.Example.TableFactory;

import AbstractFactoryPattern.Example.Factory.Link;

/**
 * @author yiqru
 * @date 2021/11/17 5:19 下午
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href =\"" + url + "\">" + caption + "</a></td>\n";
    }
}
