package prototype;

import prototype.framework.Product;

/** 문자열을 받아 밑줄이 그어진 문자열을 출력하는 클래스 */
public class UnderLinePen implements Product {
  private char ulchar;

  /**
   * 밑줄에 사용할 문자를 받아 생성한다.
   *
   * @param ulchar 밑줄에 사용할 문자
   */
  public UnderLinePen(char ulchar) {
    this.ulchar = ulchar;
  }

  /** 쌍따옴표로 묶인 밑줄이 그어진 문자열을 출력한다. */
  public void use(String s) {
    int length = s.getBytes().length;

    System.out.println("\"" + s + "\"");
    for (int i = 0; i < length + 2; i++) {
      System.out.print(ulchar);
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
