package template;

/** Template 패턴을 구현한다. CharDisplay와 StringDisplay는 서로 다른 클래스이지만 AbstractDisplay에 정의된 로직을 사용한다. */
public class Main {
  public static void main(String[] args) {
    AbstractDisplay d1 = new CharDisplay('H');
    AbstractDisplay d2 = new StringDisplay("Hello, world.");
    AbstractDisplay d3 = new StringDisplay("안녕하세요");

    d1.display();
    d2.display();
    d3.display();
  }
}
