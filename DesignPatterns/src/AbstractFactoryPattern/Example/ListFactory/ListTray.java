package AbstractFactoryPattern.Example.ListFactory;

import AbstractFactoryPattern.Example.Factory.Item;
import AbstractFactoryPattern.Example.Factory.Tray;

import java.util.Iterator;

/**
 * @author yiqru
 * @date 2021/11/17 4:42 下午
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
