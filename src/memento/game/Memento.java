package memento.game;

import java.util.Vector;

/** Gamer의 상태를 나타내는 클래스 */
public class Memento {
  int money; // 돈
  Vector fruits; // 과일

  /** 돈을 인수로 받아 생성한다. */
  Memento(int money) {
    this.money = money;
    this.fruits = new Vector();
  }

  /** 돈을 얻는다. */
  public int getMoney() {
    return money;
  }

  /** 과일을 추가한다. */
  void addFruit(String fruit) {
    fruits.add(fruit);
  }
}
