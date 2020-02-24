package adapter.delegation;

/** Banner클래스를 Print인터페이스에 맞게 변경하는 Adapter 역할을 하는 클래스이다. */
public class PrintBanner extends Print {
  private Banner banner;

  /**
   * 표현할 문자열을 받아 생성한다. 생성시 내부의 Banner 클래스를 초기화한다.
   *
   * @param string 표현하고자하는 문자열
   */
  public PrintBanner(String string) {
    this.banner = new Banner(string);
  }

  /** Banner 클래스의 showWithParen 메소드를 이용해 Print의 추상메소드를 구현한다. */
  public void printWeak() {
    banner.showWithParen();
  }

  /** Banner 클래스의 showWithAster 메소드를 이용해 Print의 추상메소드를 구현한다. */
  public void printStrong() {
    banner.showWithAster();
  }
}
