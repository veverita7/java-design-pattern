package flyweight;

/** 동작 테스트용 클래스 */
public class Main {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("숫자 인수가 필요합니다.");
      System.exit(0);
    }

    BigString bs = new BigString(args[0]);
    bs.print();
  }
}
