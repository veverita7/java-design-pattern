package prototype.framework;

/** Cloneable 인터페이스를 상속한 제품 인터페이스 */
public interface Product extends Cloneable {
  /**
   * 사용을 의미하는 메소드로 내용은 하위 클래스의 구현에 맡긴다.
   *
   * @param s 제품의 사용에 필요한 문자열
   */
  public abstract void use(String s);

  /**
   * 제품 인스턴스를 복제하기 위한 메소드이다.
   *
   * @return 제품 인스턴스
   */
  public abstract Product createClone();
}
