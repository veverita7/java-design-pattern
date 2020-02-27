package strategy;

import java.util.Random;

/** 이기면 다음에도 같은 손을 내미는 전략의 클래스 */
public class WinningStrategy implements Strategy {
  private Random random;
  private boolean won = false;
  private Hand prevHand;

  /**
   * 시드값을 받아 전략을 생성한다.
   *
   * @param seed 랜덤값을 위한 시드값
   */
  public WinningStrategy(int seed) {
    random = new Random(seed);
  }

  /**
   * 이기면 기존에 냈던 손을, 지면 랜덤으로 낸다.
   *
   * @return 전략에 따른 다음 손
   */
  public Hand nextHand() {
    if (!won) {
      prevHand = Hand.getHand(random.nextInt(3));
    }
    return prevHand;
  }

  /** 대결의 결과를 저장한다. */
  public void study(boolean win) {
    won = win;
  }
}
