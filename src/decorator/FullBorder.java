package decorator;

/** 상하좌우에 장식이 붙은 클래스 */
public class FullBorder extends Border {
  /** Display 인스턴스를 받아 생성한다. */
  public FullBorder(Display display) {
    super(display);
  }

  /** 내용물의 양쪽에 장식 문자 개수를 더해 반환한다. */
  public int getColumns() {
    return 1 + display.getColumns() + 1;
  }

  /** 내용물의 줄수에 상하의 장식 문자 개수를 더해 반환한다. */
  public int getRows() {
    return 1 + display.getRows() + 1;
  }

  /** 내용물의 상하좌우에 장식 문자를 붙여 반환한다. */
  public String getRowText(int row) {
    if (row == 0) {
      return "+" + makeLine('-', display.getColumns()) + "+";
    } else if (row == display.getRows() + 1) {
      return "+" + makeLine('-', display.getColumns()) + "+";
    } else {
      return "|" + display.getRowText(row - 1) + "|";
    }
  }

  /** 문자 ch를 count개 연속시킨 문자열을 만든다. */
  private String makeLine(char ch, int count) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < count; i++) {
      sb.append(ch);
    }
    return sb.toString();
  }
}
