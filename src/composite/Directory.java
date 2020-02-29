package composite;

import java.util.Iterator;
import java.util.Vector;

/** 디렉토리를 나타내는 클래스 */
public class Directory extends Entry {
  private String name;
  private Vector directory = new Vector();

  public Directory(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  /** 가지고 있는 Entry 항목을 가져와 값을 합쳐서 리턴한다. */
  public int getSize() {
    int size = 0;
    Iterator it = directory.iterator();
    while (it.hasNext()) {
      Entry entry = (Entry) it.next();
      size += entry.getSize();
    }
    return size;
  }

  public Entry add(Entry entry) {
    directory.add(entry);
    return this;
  }

  /** 가지고 있는 Entry 항목을 가져와 재귀적으로 값을 출력한다. */
  protected void printList(String prefix) {
    System.out.println(prefix + "/" + this);
    Iterator it = directory.iterator();
    while (it.hasNext()) {
      Entry entry = (Entry) it.next();
      entry.printList(prefix + "/" + name);
    }
  }
}
