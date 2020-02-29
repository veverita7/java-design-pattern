package visitor;

import java.util.Iterator;

/** Visitor의 하위 클래스로 파일이나 디렉토리의 일람을 나타내는 클래스 */
public class ListVisitor extends Visitor {
  private String currentdir = "";

  /** 파일을 방문했을때 호출된다. */
  public void visit(File file) {
    System.out.println(currentdir + "/" + file);
  }

  /** 디렉토리를 방문했을때 호출된다. */
  public void visit(Directory directory) {
    System.out.println(currentdir + "/" + directory);
    String savedir = currentdir;
    currentdir += "/" + directory.getName();
    Iterator it = directory.iterator();
    while (it.hasNext()) {
      Entry entry = (Entry) it.next();
      entry.accept(this);
    }
    currentdir = savedir;
  }
}
