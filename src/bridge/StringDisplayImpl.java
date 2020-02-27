package bridge;

/** 문자열을 사용해서 표시하는 클래스 (구현의 클래스) */
public class StringDisplayImpl extends DisplayImpl {
  private String string;
  private int width;

  /**
   * 표시하려는 문자열을 받아 생성한다.
   *
   * @param string 표시할 문자열
   */
  public StringDisplayImpl(String string) {
    this.string = string;
    this.width = string.getBytes().length;
  }

  public void rawOpen() {
    printLine();
  }

  public void rawPrint() {
    System.out.println("|" + string + "|");
  }

  public void rawClose() {
    printLine();
  }

  /** 문자열 길이만큼 선을 그린다. */
  private void printLine() {
    System.out.print("+");
    for (int i = 0; i < width; i++) {
      System.out.print("-");
    }
    System.out.println("+");
  }
}
