package chainofresponsibility;

/** 홀수 번호의 트러블을 해결하는 구상 클래스 */
public class OddSupport extends Support {
  public OddSupport(String name) {
    super(name);
  }

  /** 트러블 번호가 홀수이면 해결한다. */
  protected boolean resolve(Trouble trouble) {
    if (trouble.getNumber() % 2 == 1) {
      return true;
    } else {
      return false;
    }
  }
}
