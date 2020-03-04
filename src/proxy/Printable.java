package proxy;

/** Printer와 PrinterProxy의 공통 인터페이스 */
public interface Printable {
  /** 프린터 이름을 설정한다. */
  public abstract void setPrinterName(String name);

  /** 프린터 이름을 얻는다. */
  public abstract String getPrinterName();

  /** 메세지를 표시한다. */
  public abstract void print(String msg);
}
