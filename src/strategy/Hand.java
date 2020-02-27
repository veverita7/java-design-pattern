package strategy;

/** 가위바위보의 '손'을 나타내는 클래스 */
public class Hand {
  public static final int HANDVALUE_GUU = 0;
  public static final int HANDVALUE_CHO = 1;
  public static final int HANDVALUE_PAA = 2;
  public static final Hand[] hand = {
    new Hand(HANDVALUE_GUU), new Hand(HANDVALUE_CHO), new Hand(HANDVALUE_PAA)
  };
  private static final String[] name = {"주먹", "가위", "보"};
  private int handvalue;

  /**
   * getHand를 통해서만 인스턴스를 반환하기 위해 private 으로 설정한다.
   *
   * @param handvalue 가위바위보값
   */
  private Hand(int handvalue) {
    this.handvalue = handvalue;
  }

  /**
   * 손을 반환하는 Singleton 패턴의 일종이다.
   *
   * @param handvalue 가위바위보값
   * @return 인수값의 Hand 클래스 인스턴스
   */
  public static Hand getHand(int handvalue) {
    return hand[handvalue];
  }

  /**
   * 인수로 받은 Hand 클래스 인스턴스보다 강한지 비교한다.
   *
   * @param h 비교 대상의 Hand 클래스 인스턴스
   * @return 강하면 true, 약하면 false
   */
  public boolean isStrongerThan(Hand h) {
    return fight(h) == 1;
  }

  /**
   * 인수로 받은 Hand 클래스 인스턴스보다 약한지 비교한다.
   *
   * @param h 비교 대상의 Hand 클래스 인스턴스
   * @return 약하면 true, 강하면 false
   */
  public boolean isWeakerThan(Hand h) {
    return fight(h) == -1;
  }

  /**
   * 인수로 받은 Hand 클래스 인스턴스와 대결하여 결과를 반환한다.
   *
   * @param h 비교 대상이 되는 Hand 클래스 인스턴스
   * @return 이기면 1, 지면 -1, 비기면 0
   */
  private int fight(Hand h) {
    if (this == h) {
      return 0;
    } else if ((this.handvalue + 1) % 3 == h.handvalue) {
      return 1;
    } else {
      return -1;
    }
  }

  /** Hand 클래스를 문자열로 반환한다. */
  public String toString() {
    return name[handvalue];
  }
}
