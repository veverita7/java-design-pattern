package observer;

/** 관찰자를 나타내는 인터페이스 */
public interface Observer {
  /** NumberGenerator의 내용을 가지고 Observer를 변경한다. */
  public abstract void update(NumberGenerator generator);
}
