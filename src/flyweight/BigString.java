package flyweight;

/** BigChar를 모아서 만든 큰 문자열을 나타내는 클래스 */
public class BigString {
  private BigChar[] bigchars; // 큰 문자열을 보관한다.

  /** 문자열을 받아 생성한다. */
  public BigString(String string) {
    bigchars = new BigChar[string.length()];
    BigCharFactory factory = BigCharFactory.getInstance();
    for (int i = 0; i < bigchars.length; i++) {
      bigchars[i] = factory.getBigChar(string.charAt(i));
    }
  }

  /** 큰 문자열을 표시한다. */
  public void print() {
    for (int i = 0; i < bigchars.length; i++) {
      bigchars[i].print();
    }
  }
}
