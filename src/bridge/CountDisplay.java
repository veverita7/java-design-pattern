package bridge;

/** 지정 횟수만 표시하는 기능을 추가한 클래스 (기능의 클래스) */
public class CountDisplay extends Display {
  public CountDisplay(DisplayImpl impl) {
    super(impl);
  }

  /**
   * Display 기능을 확장한다.
   *
   * @param times 프린트 횟수
   */
  public void multiDisplay(int times) {
    open();
    for (int i = 0; i < times; i++) {
      print();
    }
    close();
  }
}
