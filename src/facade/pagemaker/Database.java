package facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/** 메일 주소로부터 사용자명을 얻는 클래스 */
public class Database {
  /** 인스턴스를 생성하지 않기 위해 private으로 선언한다. */
  private Database() {}

  /** dbname의 txt파일에서 Properties를 얻는다. */
  public static Properties getProperties(String dbname) {
    String filename = dbname + ".txt";
    Properties prop = new Properties();
    try {
      prop.load(new FileInputStream(filename));
    } catch (IOException e) {
      System.out.println("Warning: " + filename + " is not found.");
    }
    return prop;
  }
}
