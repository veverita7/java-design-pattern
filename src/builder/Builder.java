package builder;

/** 문서를 구성하기 위한 메소드를 결정한 추상 클래스 */
public abstract class Builder {
  /**
   * 문서의 제목을 만든다.
   *
   * @param title 제목 문자열
   */
  public abstract void makeTitle(String title);

  /**
   * 문서의 내용을 만든다.
   *
   * @param str 내용 문자열
   */
  public abstract void makeString(String str);

  /**
   * 문서의 항목을 만든다.
   *
   * @param items 항목 배열
   */
  public abstract void makeItems(String[] items);

  /**
   * 완성된 문서를 반환한다.
   *
   * @return 문서
   */
  public abstract Object getResult();
}
