package visitor;

/** File에 대해서 add한 경우에 발생하는 예외 클래스 */
public class FileTreatmentException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public FileTreatmentException() {}

  public FileTreatmentException(String msg) {
    super(msg);
  }
}
