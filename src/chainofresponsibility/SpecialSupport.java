package chainofresponsibility;

/** 지정 번호의 트러블을 해결하는 구상 클래스 */
public class SpecialSupport extends Support {
  private int number;

  /** 해결자 이름과 번호를 받아 생성한다. */
  public SpecialSupport(String name, int number) {
    super(name);
    this.number = number;
  }

  /** 트러블 번호가 일치하면 해결한다. */
  protected boolean resolve(Trouble trouble) {
    if (trouble.getNumber() == number) {
      return true;
    } else {
      return false;
    }
  }
}
