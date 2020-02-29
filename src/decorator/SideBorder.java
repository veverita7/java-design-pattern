package decorator;

/** 좌우에만 장식이 붙은 클래스 */
public class SideBorder extends Border {
  private char borderChar;

  /** 생성자에서 Display와 장식문자를 받아 생성한다. */
  public SideBorder(Display display, char ch) {
    super(display);
    this.borderChar = ch;
  }

  /** 내용물의 양쪽에 장식 문자 개수를 더해 반환한다. */
  public int getColumns() {
    return 1 + display.getColumns() + 1;
  }

  /** 내용물의 줄 수와 같다. */
  public int getRows() {
    return display.getRows();
  }

  /** 내용물의 앞뒤에 장식문자를 붙여 반환한다. */
  public String getRowText(int row) {
    return borderChar + display.getRowText(row) + borderChar;
  }
}
