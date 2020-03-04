package proxy;

/** 동작 테스트용 클래스 */
public class Main {
  public static void main(String[] args) {
    Printable p = new PrinterProxy("Park");
    System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
    p.setPrinterName("Lee");
    System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
    p.print("Hello, world");
  }
}
