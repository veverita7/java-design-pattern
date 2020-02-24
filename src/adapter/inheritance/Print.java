package adapter.inheritance;

/** Adapter패턴에서 출력의 대상이 되는 인터페이스이다. */
public interface Print {
  public abstract void printWeak();

  public abstract void printStrong();
}
