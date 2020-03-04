package flyweight;

import java.util.Hashtable;

/** BigChar의 인스턴스를 공유하고 생성하는 클래스 */
public class BigCharFactory {
  private Hashtable pool = new Hashtable(); // 만들어진 BigChar 인스턴스를 보관
  private static BigCharFactory singleton = new BigCharFactory(); // 싱글톤 패턴

  private BigCharFactory() {}

  /** 유일한 BigCharFactory 인스턴스를 얻는다. */
  public static BigCharFactory getInstance() {
    return singleton;
  }

  public synchronized BigChar getBigChar(char charname) {
    BigChar bc = (BigChar) pool.get(charname);
    if (bc == null) {
      bc = new BigChar(charname);
      pool.put(charname, bc);
    }
    return bc;
  }
}
