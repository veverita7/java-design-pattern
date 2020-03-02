package state;

/** 주간의 상태를 나타내는 클래스 */
public class DayState implements State {
  private static DayState singleton = new DayState();

  private DayState() {}

  /** Singleton 패턴을 사용하여 인스턴스를 얻는다. */
  public static State getInstance() {
    return singleton;
  }

  /** 시간에 따라 Context의 상태를 변경한다. */
  public void doClock(Context context, int hour) {
    if (hour < 9 || 17 <= hour) {
      context.changeState(NightState.getInstance());
    }
  }

  /** 금고 사용시 로그를 남긴다. */
  public void doUse(Context context) {
    context.recordLog("금고사용(주간)");
  }

  /** 비상벨 작동시 경비센터에 알린다. */
  public void doAlarm(Context context) {
    context.callSecurityCenter("비상벨(주간)");
  }

  /** 전화를 하는 경우 일반통화를 건다. */
  public void doPhone(Context context) {
    context.callSecurityCenter("일반통화(주간)");
  }

  public String toString() {
    return "[주간]";
  }
}
