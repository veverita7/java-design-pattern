package template;

/** 처리의 흐름을 정의하고 있는 추상 클래스이다. */
public abstract class AbstractDisplay {
  public abstract void open();

  public abstract void print();

  public abstract void close();

  /** open하고 print를 5번 반복하고 close한다. */
  public final void display() {
    open();
    for (int i = 0; i < 5; i++) {
      print();
    }
    close();
  }
}
