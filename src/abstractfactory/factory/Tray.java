package abstractfactory.factory;

import java.util.Vector;

/** 추상적인 부품: Link와 Tray를 모은 클래스 */
public abstract class Tray extends Item {
  protected Vector tray = new Vector();

  /**
   * 목차를 받아 생성한다.
   *
   * @param caption 목차
   */
  public Tray(String caption) {
    super(caption);
  }

  /**
   * Item을 내부에 추가한다.
   *
   * @param item Item 인스턴스
   */
  public void add(Item item) {
    tray.add(item);
  }
}
