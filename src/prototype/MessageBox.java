package prototype;

import prototype.framework.Product;

/** 문자열을 받아 데코레이션 문자로 둘러싸는 클래스 */
public class MessageBox implements Product {
  private char decochar;

  /**
   * 박스에 사용할 문자를 받아 생성한다.
   *
   * @param decochar 박스에 사용할 문자
   */
  public MessageBox(char decochar) {
    this.decochar = decochar;
  }

  /** 박스로 둘러싸인 문자열을 출력한다. */
  public void use(String s) {
    int length = s.getBytes().length;

    for (int i = 0; i < length + 2; i++) {
      System.out.print(decochar);
    }
    System.out.println();
    System.out.println(decochar + s + decochar);
    for (int i = 0; i < length + 2; i++) {
      System.out.print(decochar);
    }
    System.out.println();
  }

  /**
   * 자기 자신을 복제해 반환한다.
   *
   * @return 복제한 자신의 인스턴스
   */
  public Product createClone() {
    Product product = null;
    try {
      product = (Product) this.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return product;
  }
}
