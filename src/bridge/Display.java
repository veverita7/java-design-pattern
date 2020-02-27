package bridge;

/** 표시하는 클래스 (기능의 클래스) */
public class Display {
  private DisplayImpl impl;

  /**
   * 구현을 나타내는 클래스 인스턴스를 받아 생성한다.
   *
   * @param impl 구현의 역할을 하는 클래스 인스턴스
   */
  public Display(DisplayImpl impl) {
    this.impl = impl;
  }

  public void open() {
    impl.rawOpen();
  }

  public void print() {
    impl.rawPrint();
  }

  public void close() {
    impl.rawClose();
  }

  /** Template 패턴을 사용한다. */
  public final void display() {
    open();
    print();
    close();
  }
}
