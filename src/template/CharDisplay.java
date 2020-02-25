package template;

/** AbstractDisplay 추상클래스를 구현한 클래스이다. */
public class CharDisplay extends AbstractDisplay {
  private char ch;

  /**
   * 표현할 문자를 받아 생성한다.
   *
   * @param ch 표현할 문자
   */
  public CharDisplay(char ch) {
    this.ch = ch;
  }

  public void open() {
    System.out.print("<<");
  }

  public void print() {
    System.out.print(ch);
  }

  public void close() {
    System.out.println(">>");
  }
}
