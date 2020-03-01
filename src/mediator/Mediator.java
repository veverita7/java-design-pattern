package mediator;

/** 카운셀러인 Mediator의 API를 정하는 인터페이스 */
public interface Mediator {
  /** Mediator가 관리하는 멤버(Colleague)를 생성한다. */
  public abstract void createColleagues();

  /** 멤버인 colleague로부터 호출된다. */
  public abstract void colleagueChanged(Colleague colleague);
}
