package composite;

/** 파일에 Entry를 추가하려고 했을 때에 발생하는 예외 클래스 */
public class FileTreatmentException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public FileTreatmentException() {}

  public FileTreatmentException(String msg) {
    super(msg);
  }
}
