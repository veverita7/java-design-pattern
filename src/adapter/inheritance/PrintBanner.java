package adapter.inheritance;

/** Banner클래스를 Print인터페이스에 맞게 변경하는 Adapter 역할을 하는 클래스이다. */
public class PrintBanner extends Banner implements Print {
  /**
   * Banner 클래스의 생성자를 오버라이딩한다.
   *
   * @param string 표현하고자하는 문자열
   */
  public PrintBanner(String string) {
    super(string);
  }

  /** Banner 클래스의 showWithParen 메소드를 이용해 Print 인터페이스를 구현한다. */
  public void printWeak() {
    showWithParen();
  }

  /** Banner 클래스의 showWithAster 메소드를 이용해 Print 인터페이스를 구현한다. */
  public void printStrong() {
    showWithAster();
  }
}
