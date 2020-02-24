package adapter.delegation;

/** Adapter패턴에서 출력의 대상이 되는 추상클래스이다. */
public abstract class Print {
  public abstract void printWeak();

  public abstract void printStrong();
}
