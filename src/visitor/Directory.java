package visitor;

import java.util.Iterator;
import java.util.Vector;

/** 디렉토리를 나타내는 클래스 */
public class Directory extends Entry {
  private String name;
  private Vector dir = new Vector();

  /** 디렉토리명을 받아 실행한다. */
  public Directory(String name) {
    this.name = name;
  }

  /** 디렉토리명을 얻는다. */
  public String getName() {
    return name;
  }

  /** 디렉토리가 가지고 있는 모든 Entry의 크기를 얻는다. */
  public int getSize() {
    int size = 0;
    Iterator it = dir.iterator();
    while (it.hasNext()) {
      Entry entry = (Entry) it.next();
      size += entry.getSize();
    }
    return size;
  }

  /** Entry(파일 또는 디렉토리)를 추가한다. */
  public Entry add(Entry entry) {
    dir.add(entry);
    return this;
  }

  /** Iterator를 얻는다. */
  public Iterator iterator() {
    return dir.iterator();
  }

  /** Visitor를 받아 visit 메소드를 실행한다. */
  public void accept(Visitor v) {
    v.visit(this);
  }
}
