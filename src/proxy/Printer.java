package proxy;

/** 이름이 붙은 프린터를 나타내는 클래스(본인) */
public class Printer implements Printable {
  private String name;

  /** 이름이 없는 Printer를 생성한다. */
  public Printer() {
    heavyJob("Printer의 인스턴스를 생성중");
  }

  /** 이름을 받아 생성한다. */
  public Printer(String name) {
    this.name = name;
    heavyJob("Printer의 인스턴스(" + name + ")를 생성중");
  }

  /** 프린터 이름을 설정한다. */
  public void setPrinterName(String name) {
    this.name = name;
  }

  /** 프린터 이름을 얻는다. */
  public String getPrinterName() {
    return name;
  }

  /** 메세지를 출력한다. */
  public void print(String msg) {
    System.out.println("=== " + name + " ===");
    System.out.println(msg);
  }

  /** 무거운 작업을 수행한다. */
  private void heavyJob(String msg) {
    System.out.print(msg);
    for (int i = 0; i < 5; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.print(".");
    }
    System.out.println("완료.");
  }
}
