package state;

/** 야간의 상태를 나타내는 클래스 */
public class NightState implements State {
  private static NightState singleton = new NightState();

  private NightState() {}

  /** Singleton 패턴을 사용하여 인스턴스를 얻는다. */
  public static State getInstance() {
    return singleton;
  }

  /** 시간에 따라 Context의 상태를 변경한다. */
  public void doClock(Context context, int hour) {
    if (9 <= hour && hour < 17) {
      context.changeState(DayState.getInstance());
    }
  }

  /** 금고 사용시 경비센터에 전화한다. */
  public void doUse(Context context) {
    context.callSecurityCenter("비상:야간의 금고사용");
  }

  /** 비상벨 작동시 경비센터에 알린다. */
  public void doAlarm(Context context) {
    context.callSecurityCenter("비상벨(야간)");
  }

  /** 전화를 하는 경우 녹음을 한다. */
  public void doPhone(Context context) {
    context.recordLog("야간의 통화 녹음");
  }

  public String toString() {
    return "[야간]";
  }
}
