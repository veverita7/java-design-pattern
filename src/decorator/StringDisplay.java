package decorator;

/** 한 줄로 된 문자열 표시용 클래스 */
public class StringDisplay extends Display {
  private String string;

  /** 표시할 문자열을 받아 생성한다. */
  public StringDisplay(String string) {
    this.string = string;
  }

  /** 문자수를 반환한다. */
  public int getColumns() {
    return string.getBytes().length;
  }

  /** 줄수를 반환한다. (1) */
  public int getRows() {
    return 1;
  }

  /** row가 0일때 반환한다. */
  public String getRowText(int row) {
    if (row == 0) {
      return string;
    } else {
      return null;
    }
  }
}
