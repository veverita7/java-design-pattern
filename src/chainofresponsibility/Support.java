package chainofresponsibility;

/** 트러블을 해결하는 추상 클래스 */
public abstract class Support {
  private String name;
  private Support next;

  /** 해결자의 이름을 받아 생성한다. */
  public Support(String name) {
    this.name = name;
  }

  /** 다음 해결자를 설정한다. */
  public Support setNext(Support next) {
    this.next = next;
    return next;
  }

  /** 트러블 해결 순서에 따라 처리한다. */
  public final void support(Trouble trouble) {
    if (resolve(trouble)) {
      done(trouble);
    } else if (next != null) {
      next.support(trouble);
    } else {
      fail(trouble);
    }
  }

  /** 문자열로 표현한다. */
  public String toString() {
    return "[" + name + "]";
  }

  /** 해결을 위한 추상 메소드이다. */
  protected abstract boolean resolve(Trouble trouble);

  /** 트러블을 해결하면 실행한다. */
  protected void done(Trouble trouble) {
    System.out.println(trouble + " is resolved by " + this + ".");
  }

  /** 트러블을 해결하지못하면 실행한다. */
  protected void fail(Trouble trouble) {
    System.out.println(trouble + " cannot be resolved.");
  }
}
