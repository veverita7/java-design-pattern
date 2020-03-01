package facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/** 메일 주소로부터 사용자의 웹 페이지를 작성하는 클래스 */
public class PageMaker {
  /** 인스턴스를 생성하지 않기 위해 private으로 선언한다. */
  private PageMaker() {}

  /** 웹 페이지 파일을 생성한다. */
  public static void makeWelcomePage(String mailaddr, String filename) {
    try {
      Properties mailprop = Database.getProperties("maildata");
      String username = mailprop.getProperty(mailaddr);
      HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
      writer.title("Welcome to " + username + "'s page!");
      writer.paragraph(username + "의 페이지에 오신걸 환영합니다");
      writer.paragraph("메일이 기다리고 있습니다");
      writer.mailto(mailaddr, username);
      writer.close();
      System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
