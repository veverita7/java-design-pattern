package observer;

/** 숫자로 수를 표시하는 클래스 */
public class DigitObserver implements Observer {
  /** NumberGenerator의 수를 숫자로 출력한다. */
  public void update(NumberGenerator generator) {
    System.out.println("DigitObserver:" + generator.getNumber());
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
