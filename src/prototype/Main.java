package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;

/** Manager 클래스와 MessageBox, UnderLinePen 클래스를 이용해 Prototype 패턴을 구현한 클래스 */
public class Main {
  public static void main(String[] args) {
    UnderLinePen upen = new UnderLinePen('-');
    MessageBox mbox = new MessageBox('*');
    MessageBox sbox = new MessageBox('/');

    Manager manager = new Manager();
    manager.register("strong message", upen);
    manager.register("warning box", mbox);
    manager.register("slash box", sbox);

    Product p1 = manager.create("strong message");
    p1.use("Hello, world.");
    Product p2 = manager.create("warning box");
    p2.use("Hello, world.");
    Product p3 = manager.create("slash box");
    p3.use("Hello, world.");
  }
}
