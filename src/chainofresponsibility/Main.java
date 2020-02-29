package chainofresponsibility;

/** Support들의 연쇄를 만들어 트러블을 일으키는 동작 테스트용 클래스 */
public class Main {
  public static void main(String[] args) {
    Support alice = new NoSupport("Alice");
    Support bob = new LimitSupport("Bob", 100);
    Support charlie = new SpecialSupport("Charlie", 429);
    Support diana = new LimitSupport("Diana", 200);
    Support elmo = new OddSupport("Elmo");
    Support fred = new LimitSupport("Fred", 300);

    // 책임의 체인을 형성한다.
    alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

    // 다양한 트러블을 발생한다.
    for (int i = 0; i < 500; i += 33) {
      alice.support(new Trouble(i));
    }
  }
}
