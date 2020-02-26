package abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Vector;

/** 추상적인 제품: HTML의 페이지를 나타내는 클래스 */
public abstract class Page {
  protected String title;
  protected String author;
  protected Vector content = new Vector();

  /**
   * 제목과 작성자를 받아 생성한다.
   *
   * @param title 제목
   * @param author 작성자
   */
  public Page(String title, String author) {
    this.title = title;
    this.author = author;
  }

  /**
   * Item을 내부에 저장한다.
   *
   * @param item Item 인스턴스
   */
  public void add(Item item) {
    content.add(item);
  }

  /** HTML 파일을 출력한다. */
  public void output() {
    try {
      String filename = title + ".html";
      Writer writer = new FileWriter(filename);
      writer.write(this.makeHTML());
      writer.close();
      System.out.println(filename + "을 작성했습니다.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * HTML 파일 내용을 반환한다.
   *
   * @return HTML 파일 내용
   */
  public abstract String makeHTML();
}
