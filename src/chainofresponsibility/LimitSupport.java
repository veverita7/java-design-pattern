package chainofresponsibility;

/** 지정한 번호 미만의 트러블을 해결하는 구상 클래스 */
public class LimitSupport extends Support {
  private int limit;

  /** 해결자 이름과 트러블 번호를 받아 생성한다. */
  public LimitSupport(String name, int limit) {
    super(name);
    this.limit = limit;
  }

  /** 트러블 번호가 기준 미만이면 해결한다. */
  protected boolean resolve(Trouble trouble) {
    if (trouble.getNumber() < limit) {
      return true;
    } else {
      return false;
    }
  }
}
