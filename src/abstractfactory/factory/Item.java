package abstractfactory.factory;

/** Link와 Tray를 통일적으로 다루기 위한 클래스 */
public abstract class Item {
  protected String caption;

  /**
   * 목차를 받아 생성한다.
   *
   * @param caption 목차
   */
  public Item(String caption) {
    this.caption = caption;
  }

  /**
   * HTML 문자열을 반환한다.
   *
   * @return HTML 문자열
   */
  public abstract String makeHTML();
}
