package strategy;

/** 가위바위보를 하는 플레이어를 나타내는 클래스 */
public class Player {
  private String name;
  private Strategy strategy;
  private int wincount;
  private int losecount;
  private int gamecount;

  /**
   * 이름과 사용할 전략을 이용해 사용자를 생선한다.
   *
   * @param name 사용자 이름
   * @param strategy 사용할 전략
   */
  public Player(String name, Strategy strategy) {
    this.name = name;
    this.strategy = strategy;
  }

  /**
   * 전략에 따라 다음 손을 반환한다.
   *
   * @return 다음에 내려는 손
   */
  public Hand nextHand() {
    return strategy.nextHand();
  }

  /** 대결 결과를 학습하고 저장한다. */
  public void win() {
    strategy.study(true);
    wincount++;
    gamecount++;
  }

  /** 대결 결과를 학습하고 저장한다. */
  public void lose() {
    strategy.study(false);
    losecount++;
    gamecount++;
  }

  /** 대결 결과를 저장한다. */
  public void even() {
    gamecount++;
  }

  public String toString() {
    return "[" + name + ": " + gamecount + " games, " + wincount + " win, " + losecount + " lose]";
  }
}
