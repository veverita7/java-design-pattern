package prototype.framework;

import java.util.Hashtable;

/** Product 인터페이스를 이용해 인스턴스를 복제하는 클래스 */
public class Manager {
  private Hashtable showcase = new Hashtable();

  /**
   * 제품을 이름과 매칭하여 등록한다.
   *
   * @param name 제품의 이름
   * @param proto 제품 생성을 위한 프로토
   */
  public void register(String name, Product proto) {
    showcase.put(name, proto);
  }

  /**
   * showcase에 등록된 제품을 찾아서 복제한 제품의 인스턴스를 반환한다.
   *
   * @param protoname 제품의 이름
   * @return 복제한 제품 인스턴스
   */
  public Product create(String protoname) {
    Product p = (Product) showcase.get(protoname);
    return p.createClone();
  }
}
