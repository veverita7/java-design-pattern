package factorymethod.idcard;

import factorymethod.framework.Product;

/** Product 추상클래스를 구현한 클래스이다. */
public class IDCard extends Product {
  private String owner;

  /**
   * 주인 이름을 받아 IDCard를 생성한다. IDCardFactory에서만 생성하기에 default 접근자로 설정했다.
   *
   * @param owner 주인 이름
   */
  IDCard(String owner) {
    System.out.println(owner + "의 카드를 만듭니다.");
    this.owner = owner;
  }

  /**
   * IDCard의 주인 이름을 반환한다.
   *
   * @return 주인 이름
   */
  public String getOwner() {
    return owner;
  }

  /** Product의 use 메소드를 구현한 메소드이다. */
  public void use() {
    System.out.println(owner + "의 카드를 사용합니다.");
  }
}
