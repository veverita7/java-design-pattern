package iterator;

/** 집합체를 위한 인터페이스이다. */
public interface Aggregate {
  /**
   * 집합체의 요소에 대한 반복자(Iterator)를 반환한다.
   *
   * @return 집합체 요소에 대한 반복자
   */
  public abstract Iterator iterator();
}
