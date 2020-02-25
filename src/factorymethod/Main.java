package factorymethod;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;
import factorymethod.idcard.IDCardFactory;

/**
 * FactoryMethod 패턴을 구현한 클래스이다. IDCardFactory를 이용해 IDCard를 생성한다. 생성한 IDCard를 Product 추상클래스에 정의한
 * use메소드를 이용해 실행한다.
 */
public class Main {
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();

    Product card1 = factory.create("User");
    Product card2 = factory.create("Admin");
    Product card3 = factory.create("Viewer");

    card1.use();
    card2.use();
    card3.use();
  }
}
