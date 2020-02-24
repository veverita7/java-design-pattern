package iterator;

/** 루프 변수와 같은 역할을 하는 인터페이스이다. */
public interface Iterator {
  /**
   * 집합체에 다음 요소가 존재하는지 확인한다.
   *
   * @return 다음요소가 있으면 True 없으면 False
   */
  public abstract boolean hasNext();

  /**
   * 집합체의 다음 요소를 반환한다.
   *
   * @return 집합체의 다음 요소
   */
  public abstract Object next();
}
