package abstractfactory.factory;

/** 추상적인 부품: HTML 링크를 나타내는 클래스 */
public abstract class Link extends Item {
  protected String url;

  /**
   * 목차와 URL을 받아 생성한다.
   *
   * @param caption 목차
   * @param url URL경로
   */
  public Link(String caption, String url) {
    super(caption);
    this.url = url;
  }
}
