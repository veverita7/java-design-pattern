package facade;

import facade.pagemaker.PageMaker;

/** 동작 테스트용 클래스 */
public class Main {
  public static void main(String[] args) {
    PageMaker.makeWelcomePage("park@github.io", "welcome.html");
  }
}
