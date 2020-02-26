package abstractfactory.listfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

/** 구체적인 공장을 나타내는 클래스 */
public class ListFactory extends Factory {
  public Link createLink(String caption, String url) {
    return new ListLink(caption, url);
  }

  public Tray createTray(String caption) {
    return new ListTray(caption);
  }

  public Page createPage(String title, String author) {
    return new ListPage(title, author);
  }
}
