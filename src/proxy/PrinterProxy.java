package proxy;

/** 이름이 붙은 클래스를 나타내는 클래스(대리인) */
public class PrinterProxy implements Printable {
  private String name;
  private Printer real; // 본인

  public PrinterProxy() {}

  public PrinterProxy(String name) {
    this.name = name;
  }

  /** 프린터 이름을 설정한다. */
  public synchronized void setPrinterName(String name) {
    // 본인이 존재하면 본인에게도 설정한다.
    if (real != null) {
      real.setPrinterName(name);
    }
    this.name = name;
  }

  /** 프린터 이름을 얻는다. */
  public String getPrinterName() {
    return name;
  }

  /** 문자열을 표시한다. */
  public void print(String msg) {
    realize();
    real.print(msg);
  }

  /** 본인을 생성한다. */
  private synchronized void realize() {
    if (real == null) {
      real = new Printer(name);
    }
  }
}
