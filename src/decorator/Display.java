package decorator;

/** 문자열 표시용 추상 클래스 */
public abstract class Display {
  /** 가로의 문자 수를 얻는다. */
  public abstract int getColumns();

  /** 세로의 줄 수를 얻는다. */
  public abstract int getRows();

  /** row번째의 문자열을 얻는다. */
  public abstract String getRowText(int row);

  /** 모든 문자열을 표시한다. */
  public final void show() {
    for (int i = 0; i < getRows(); i++) {
      System.out.println(getRowText(i));
    }
  }
}
