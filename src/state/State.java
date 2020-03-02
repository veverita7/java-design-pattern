package state;

/** 금고의 상태를 나타내는 인터페이스 */
public interface State {
  /** 시간을 설정하면 호출한다. */
  public abstract void doClock(Context context, int hour);

  /** 금고를 사용하면 호출한다. */
  public abstract void doUse(Context context);

  /** 비상벨이 울리면 호출한다. */
  public abstract void doAlarm(Context context);

  /** 통화를 하면 호출한다. */
  public abstract void doPhone(Context context);
}
