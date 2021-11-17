package AbstractFactoryPattern.Example.ListFactory;

import AbstractFactoryPattern.Example.Factory.Item;
import AbstractFactoryPattern.Example.Factory.Page;

import java.util.Iterator;

/**
 * @author yiqru
 * @date 2021/11/17 4:42 下午
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body>+</html>\n");
        return buffer.toString();
    }
}
