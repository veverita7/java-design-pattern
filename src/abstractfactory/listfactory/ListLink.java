package abstractfactory.listfactory;

import abstractfactory.factory.Link;

/** 구체적인 부품: HTML의 링크를 나타내는 클래스 */
public class ListLink extends Link {
  public ListLink(String caption, String url) {
    super(caption, url);
  }

  public String makeHTML() {
    return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
  }
}
