package visitor;

/** 파일이나 디렉토리를 방문하는 방문자를 나타낸 추상 클래스 */
public abstract class Visitor {
  public abstract void visit(File file);

  public abstract void visit(Directory directory);
}
