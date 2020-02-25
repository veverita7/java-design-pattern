package factorymethod.idcard;

import java.util.Vector;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

/** Factory 추상클래스를 구현한 클래스이다. */
public class IDCardFactory extends Factory {
  private Vector owners = new Vector();

  /**
   * 등록한 제품의 주인 이름 목록을 반환한다.
   *
   * @return 등록한 제품의 주인 이름 목록
   */
  public Vector getOwners() {
    return owners;
  }

  /**
   * IDCard를 생산한다.
   *
   * @return IDCard
   */
  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }

  /** 생산한 IDCard를 등록한다. */
  protected void registerProduct(Product product) {
    owners.add(((IDCard) product).getOwner());
  }
}
