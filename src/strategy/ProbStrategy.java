package strategy;

import java.util.Random;

/** 바로 전의 손에서 다음 손을 확률적으로 계산하는 전략의 클래스 */
public class ProbStrategy implements Strategy {
  private Random random;
  private int prevHandValue = 0;
  private int currentHandValue = 0;
  private int[][] history = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

  /**
   * 랜덤값을 위한 시드값을 받아 전략을 생성한다.
   *
   * @param seed 시드값
   */
  public ProbStrategy(int seed) {
    random = new Random(seed);
  }

  /**
   * 과거 대결의 결과를 가중치로 계산해서 다음 손을 반환한다.
   *
   * @return 다음 대결에 내려는 손
   */
  public Hand nextHand() {
    int bet = random.nextInt(getSum(currentHandValue));
    int handValue = 0;
    if (bet < history[currentHandValue][0]) {
      handValue = 0;
    } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
      handValue = 1;
    } else {
      handValue = 2;
    }
    prevHandValue = currentHandValue;
    currentHandValue = handValue;
    return Hand.getHand(handValue);
  }

  /** 과거에 낸 손과 현재 낸 손을 이용해 결과를 저장한다. */
  public void study(boolean win) {
    if (win) {
      history[prevHandValue][currentHandValue]++;
    } else {
      history[prevHandValue][(currentHandValue + 1) % 3]++;
      history[prevHandValue][(currentHandValue + 2) % 3]++;
    }
  }

  /**
   * 과거 대결에서 특정 손을 냈을때 결과를 반환한다.
   *
   * @param hv 과거 대결에서 냈던 손
   * @return hv의 결과 이긴 횟수의 합
   */
  private int getSum(int hv) {
    int sum = 0;
    for (int i = 0; i < 3; i++) {
      sum += history[hv][i];
    }
    return sum;
  }
}
