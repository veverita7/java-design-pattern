package chainofresponsibility;

/** 트러블을 해결하는 (아무 처리하지않는) 구상 클래스 */
public class NoSupport extends Support {
  public NoSupport(String name) {
    super(name);
  }

  /** 해결용 메소드이지만 아무것도 처리하지않는다. */
  protected boolean resolve(Trouble trouble) {
    return false;
  }
}
