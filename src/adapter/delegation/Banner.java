package adapter.delegation;

/** 제공받은 문자열을 여러가지 형태로 표현한다. Adapter패턴에서 입력의 대상이 된다. */
public class Banner {
  private String string;

  /**
   * 표현할 문자열을 받아 생성한다.
   *
   * @param string 표현할 문자열
   */
  public Banner(String string) {
    this.string = string;
  }

  /** 문자열의 앞뒤에 괄호를 붙여서 출력한다. */
  public void showWithParen() {
    System.out.println("(" + string + ")");
  }

  /** 문자열의 앞뒤에 별표를 붙여서 출력한다. */
  public void showWithAster() {
    System.out.println("*" + string + "*");
  }
}
