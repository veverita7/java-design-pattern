package visitor;

import java.util.Iterator;

import composite.FileTreatmentException;

/** File과 Directory의 상위 클래스가 되는 추상 클래스 */
public abstract class Entry implements Acceptor {
  /** 이름을 얻는다. */
  public abstract String getName();

  /** 사이즈를 얻는다. */
  public abstract int getSize();

  /** 엔트리를 추가한다. */
  public Entry add(Entry entry) throws FileTreatmentException {
    throw new FileTreatmentException();
  }

  /** Iterator를 생성한다. */
  public Iterator iterator() throws FileTreatmentException {
    throw new FileTreatmentException();
  }

  /** 문자열로 표현한다. */
  public String toString() {
    return getName() + " (" + getSize() + ")";
  }
}
