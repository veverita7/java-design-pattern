package observer;

import java.util.Iterator;
import java.util.Vector;

/** 수를 생성하는 객체를 나타내는 추상 클래스 */
public abstract class NumberGenerator {
  private Vector observers = new Vector(); // Observer들을 보관

  /** Observer를 추가한다. */
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  /** Observer를 삭제한다. */
  public void deleteObserver(Observer observer) {
    observers.remove(observer);
  }

  /** Observer들에게 통보한다. */
  public void notifyObservers() {
    Iterator it = observers.iterator();
    while (it.hasNext()) {
      Observer o = (Observer) it.next();
      o.update(this);
    }
  }

  /** 수를 얻는다. */
  public abstract int getNumber();

  /** 수를 생성한다. */
  public abstract void execute();
}
