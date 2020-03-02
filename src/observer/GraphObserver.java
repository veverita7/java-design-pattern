package observer;

/** 간이 그래프로 수를 표시하는 클래스 */
public class GraphObserver implements Observer {
  /** NumberGenerator의 수를 간이 그래프로 출력한다. */
  public void update(NumberGenerator generator) {
    System.out.print("GraphObserver:");
    for (int i = 0; i < generator.getNumber(); i++) {
      System.out.print("*");
    }
    System.out.println();
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
