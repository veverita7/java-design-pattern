package mediator;

/** 멤버의 API를 정하는 인터페이스 */
public interface Colleague {
  /** 카운셀러인 mediator를 등록한다. */
  public abstract void setMediator(Mediator mediator);

  /** 카운셀러인 mediator의 지시에 따라 자신의 상태를 변경한다. */
  public abstract void setColleagueEnabled(boolean enabled);
}
