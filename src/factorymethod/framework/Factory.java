package factorymethod.framework;

/** Template 패턴을 이용한 공장 역할의 추상클래스이다. */
public abstract class Factory {
  /**
   * 제품을 생성하는 메소드이다. 전체 로직이 규정되어 있고 하위 클래스에서 구체적인 기능을 제공한다.
   *
   * @param owner 제품의 주인
   * @return 생성한 제품
   */
  public final Product create(String owner) {
    Product product = createProduct(owner);
    registerProduct(product);
    return product;
  }

  /**
   * 제품을 생성하는 추상메소드이다.
   *
   * @param owner 제품의 주인
   * @return 생성한 제품
   */
  protected abstract Product createProduct(String owner);

  /**
   * 생성한 제품을 등록하는 추상메소드이다.
   *
   * @param product 생성한 제품
   */
  protected abstract void registerProduct(Product product);
}
