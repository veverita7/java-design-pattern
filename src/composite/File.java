package composite;

/** 파일을 나타내는 클래스 */
public class File extends Entry {
  private String name;
  private int size;

  /**
   * 파일명과 파일크기를 받아 생성한다.
   *
   * @param name 파일명
   * @param size 파일크기
   */
  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public int getSize() {
    return size;
  }

  protected void printList(String prefix) {
    System.out.println(prefix + "/" + this);
  }
}
