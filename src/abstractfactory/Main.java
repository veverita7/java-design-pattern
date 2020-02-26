package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

/** 동작 테스트를 위한 클래스 */
public class Main {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("구체적인 공장의 클래스명을 입력하세요.");
      System.exit(0);
    }

    Factory factory = Factory.getFactory(args[0]);

    Link joins = factory.createLink("중앙일보", "http://www.joins.com");
    Link hani = factory.createLink("한겨레", "http://www.hani.co.kr");
    Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
    Link kr_yahoo = factory.createLink("yahoo!Korea", "http://www.yahoo.co.kr");
    Link excite = factory.createLink("Excite", "http://www.excite.com");
    Link google = factory.createLink("Google", "http://www.google.com");

    Tray trayNews = factory.createTray("신문");
    trayNews.add(joins);
    trayNews.add(hani);

    Tray trayYahoo = factory.createTray("Yahoo!");
    trayYahoo.add(us_yahoo);
    trayYahoo.add(kr_yahoo);

    Tray traySearch = factory.createTray("서치엔진");
    traySearch.add(trayYahoo);
    traySearch.add(excite);
    traySearch.add(google);

    Page page = factory.createPage("LinkPage", "홍길동");
    page.add(trayNews);
    page.add(traySearch);
    page.output();
  }
}
