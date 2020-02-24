package adapter.inheritance;

/** PrintBanner 클래스를 이용해 Banner 클래스를 Print 인터페이스에 맞게 변경시킨다. */
public class Main {
  public static void main(String[] args) {
    Print print = new PrintBanner("Hello");
    print.printWeak();
    print.printStrong();
  }
}
