package builder;

/** Builder 패턴의 동작을 위한 클래스 */
public class Main {
  public static void main(String[] args) {
    if (args.length != 1) {
      printErrorMassage();
      System.exit(0);
    }

    if (args[0].equals("plain")) {
      Director director = new Director(new TextBuilder());
      String result = (String) director.construct();
      System.out.println(result);
    } else if (args[0].equals("html")) {
      Director director = new Director(new HTMLBuilder());
      String filename = (String) director.construct();
      System.out.println(filename + "이 작성되었습니다.");
    } else {
      printErrorMassage();
      System.exit(0);
    }
  }

  private static void printErrorMassage() {
    System.out.println("인수로 [plain] 또는 [html]을 입력하세요.");
  }
}
