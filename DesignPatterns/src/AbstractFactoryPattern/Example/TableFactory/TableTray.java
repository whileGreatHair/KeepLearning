package AbstractFactoryPattern.Example.TableFactory;

import AbstractFactoryPattern.Example.Factory.Item;
import AbstractFactoryPattern.Example.Factory.Tray;

import java.util.Iterator;

/**
 * @author yiqru
 * @date 2021/11/17 5:20 下午
 */
public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>");
        buffer.append("<table width=\"100%\" border=\"1\" > <tr> ");
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\""
                + tray.size() + "\"><b> " + caption + "</b></td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
            buffer.append("</tr›</table>");
            buffer.append("</td>");
        }
        return buffer.toString();
    }
}
