package state;

/** 금고의 상태를 관리하고 경비센터와 연락하는 인터페이스 */
public interface Context {
  /** 시간을 설정한다. */
  public abstract void setClock(int hour);

  /** 상태를 변경한다. */
  public abstract void changeState(State state);

  /** 경비센터에 호출한다. */
  public abstract void callSecurityCenter(String msg);

  /** 경비센터에 기록한다. */
  public abstract void recordLog(String msg);
}
