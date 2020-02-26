package singleton;

/** 유일한 하나의 인스턴스를 얻는 Singleton 패턴을 구현한 클래스 */
public class Singleton {
  private static Singleton singleton = new Singleton();

  /** 외부에서의 생성을 막기 위해서 private으로 생성한다. */
  private Singleton() {
    System.out.println("인스턴스를 생성했습니다.");
  }

  /**
   * 하나의 유일한 인스턴스를 반환한다.
   *
   * @return Singleton에서 생성한 유일한 인스턴스
   */
  public static Singleton getInstance() {
    return singleton;
  }
}
