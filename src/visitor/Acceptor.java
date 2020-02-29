package visitor;

/** Visitor 클래스의 인스턴스를 받는 데이터 구조의 인터페이스 */
public interface Acceptor {
  public abstract void accept(Visitor v);
}
