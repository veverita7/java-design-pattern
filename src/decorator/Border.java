package decorator;

/** 장식을 나타내는 추상 클래스 */
public abstract class Border extends Display {
  protected Display display;

  /** Display 인스턴스를 받아 생성한다. */
  protected Border(Display display) {
    this.display = display;
  }
}
