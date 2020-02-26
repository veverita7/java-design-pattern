package abstractfactory.factory;

/** 추상적인 공장을 나타내는 추상 클래스 */
public abstract class Factory {
  /**
   * 구체적인 공장의 인스턴스가 추상적인 공장으로 반환된다.
   *
   * @param classname 공장 클래스 이름
   * @return 추상적인 공장 인스턴스
   */
  public static Factory getFactory(String classname) {
    Factory factory = null;
    try {
      factory = (Factory) Class.forName(classname).newInstance();
    } catch (ClassNotFoundException e) {
      System.out.println("Class:" + classname + "을 찾을 수 없습니다.");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return factory;
  }

  public abstract Link createLink(String caption, String url);

  public abstract Tray createTray(String caption);

  public abstract Page createPage(String title, String author);
}
