package visitor;

/** 파일을 나타내는 클래스 */
public class File extends Entry {
  private String name;
  private int size;

  /** 파일명과 파일크기를 받아 생성한다. */
  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  /** 파일명을 얻는다. */
  public String getName() {
    return name;
  }

  /** 파일크기를 얻는다. */
  public int getSize() {
    return size;
  }

  /** Visitor를 받아 visit 메소드를 실행한다. */
  public void accept(Visitor v) {
    v.visit(this);
  }
}
