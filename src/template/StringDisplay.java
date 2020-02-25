package template;

/** AbstractDisplay 추상클래스를 구현한 클래스이다. */
public class StringDisplay extends AbstractDisplay {
  private String string;
  private int width;

  /**
   * 표현할 문자열을 받아 생성한다.
   *
   * @param string 표현할 문자열
   */
  public StringDisplay(String string) {
    this.string = string;
    this.width = string.getBytes().length;
  }

  public void open() {
    printLine();
  }

  public void print() {
    System.out.println("|" + string + "|");
  }

  public void close() {
    printLine();
  }

  /** 문자열의 길이만큼 "+----+"를 표시한다. */
  private void printLine() {
    System.out.print("+");
    for (int i = 0; i < width; i++) {
      System.out.print("-");
    }
    System.out.println("+");
  }
}
