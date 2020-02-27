package strategy;

/** 가위바위보의 '전략'을 나타내는 인터페이스 */
public interface Strategy {
  /**
   * 전략에 따라 다음손을 낸다.
   *
   * @return Hand 클래스 인스턴스
   */
  public abstract Hand nextHand();

  /**
   * 대결 결과를 연구한다.
   *
   * @param win 대결 결과로 이기면 true, 지면 false
   */
  public abstract void study(boolean win);
}
