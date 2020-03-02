package memento.game;

import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

/** Memento 인스턴스를 만드는 게임을 하는 주인공의 클래스 */
public class Gamer {
  private int money; // 돈
  private Vector fruits = new Vector(); // 과일
  private Random random = new Random(); // 난수발생기
  private static String[] fruitsname = {"사과", "포도", "바나나", "귤"}; // 과일 이름

  /** 돈을 인수로 생성한다. */
  public Gamer(int money) {
    this.money = money;
  }

  /** 돈을 얻는다. */
  public int getMoney() {
    return money;
  }

  /** 주사위게임을 실행한다. */
  public void bet() {
    int dice = random.nextInt(6) + 1;
    if (dice == 1) {
      money += 100;
      System.out.println("돈이 증가했습니다");
    } else if (dice == 2) {
      money /= 2;
      System.out.println("돈이 반으로 줄었습니다");
    } else if (dice == 6) {
      String f = getFruit();
      System.out.println("과일(" + f + ")을 받았습니다");
      fruits.add(f);
    } else {
      System.out.println("아무일도 일어나지 않았습니다");
    }
  }

  /** 스냅샷을 찍는다. */
  public Memento createMemento() {
    Memento m = new Memento(money);
    Iterator it = fruits.iterator();
    while (it.hasNext()) {
      String f = (String) it.next();
      m.addFruit(f);
    }
    return m;
  }

  /** Memento로 복원한다. */
  public void restoreMemento(Memento memento) {
    this.money = memento.money;
    this.fruits = memento.fruits;
  }

  public String toString() {
    return "[money = " + money + ", fruits = " + fruits + "]";
  }

  /** 랜덤으로 과일을 얻는다. */
  private String getFruit() {
    return fruitsname[random.nextInt(fruitsname.length)];
  }
}
