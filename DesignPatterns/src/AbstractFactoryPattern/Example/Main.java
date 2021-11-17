package AbstractFactoryPattern.Example;

import AbstractFactoryPattern.Example.Factory.Factory;
import AbstractFactoryPattern.Example.Factory.Link;
import AbstractFactoryPattern.Example.Factory.Page;
import AbstractFactoryPattern.Example.Factory.Tray;

/**
 * @author yiqru
 * @date 2021/11/17 4:22 下午
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("人民日报", "https://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "https://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "https://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!", "https://www.yahoo.co.jp/");
        Link excite = factory.createLink("Yahoo!", "https://www.excite.com/");
        Link google = factory.createLink("Yahoo!", "https://www.google.com/");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("搜索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "Brian");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}
