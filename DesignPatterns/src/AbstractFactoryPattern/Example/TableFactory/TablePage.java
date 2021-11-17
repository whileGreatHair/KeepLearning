package AbstractFactoryPattern.Example.TableFactory;

import AbstractFactoryPattern.Example.Factory.Item;
import AbstractFactoryPattern.Example.Factory.Page;

import java.util.Iterator;

/**
 * @author yiqru
 * @date 2021/11/17 5:20 下午
 */
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body> \n");
        buffer.append("<hl>" + title + "</h1>\n");
        buffer.append("<table width =\"80%\" border=\"3\">\n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append("<tr>" + item.makeHTML() + "</tr>");
        }

        buffer.append("</table›\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
