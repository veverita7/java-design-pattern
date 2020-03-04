package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** 큰 문자를 나타내는 클래스 */
public class BigChar {
  private String fontdata; // 큰 문자를 표현하는 문자열

  /** 문자를 생성한다. */
  public BigChar(char charname) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("big" + charname + ".txt"));
      String line;
      StringBuffer buf = new StringBuffer();
      while ((line = br.readLine()) != null) {
        buf.append(line);
        buf.append("\n");
      }
      br.close();
      this.fontdata = buf.toString();
    } catch (IOException e) {
      this.fontdata = charname + "?";
    }
  }

  /** 큰 문자를 표시한다. */
  public void print() {
    System.out.println(fontdata);
  }
}
