package AbstractFactoryPattern.Example.ListFactory;

import AbstractFactoryPattern.Example.Factory.Link;

/**
 * @author yiqru
 * @date 2021/11/17 4:42 下午
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n ";
    }
}
