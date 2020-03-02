package observer;

import java.util.Random;

/** 랜덤하게 수를 생성하는 클래스 */
public class RandomNumberGenerator extends NumberGenerator {
  private Random random = new Random(); // 난수발생기
  private int number; // 현재의 수

  /** 수를 얻는다. */
  public int getNumber() {
    return number;
  }

  /** 수를 생성하고 Observer들에게 통보한다. */
  public void execute() {
    for (int i = 0; i < 20; i++) {
      number = random.nextInt(50);
      notifyObservers();
    }
  }
}
