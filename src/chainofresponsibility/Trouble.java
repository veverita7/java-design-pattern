package chainofresponsibility;

/** 발생한 트러블을 나타내는 클래스 */
public class Trouble {
  private int number;

  /** 트러블 번호를 가지고 생성한다. */
  public Trouble(int number) {
    this.number = number;
  }

  /** 트러블 번호를 얻는다. */
  public int getNumber() {
    return number;
  }

  /** 문자열로 표현한다. */
  public String toString() {
    return "[Trouble " + number + "]";
  }
}
