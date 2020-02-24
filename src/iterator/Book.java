package iterator;

/** 책을 표현하는 클래스이다. */
public class Book {
  private String name = "";

  /**
   * 책을 생성한다. 책을 생성할때에는 책이름을 인수로 받는다.
   *
   * @param name 책이름
   */
  public Book(String name) {
    this.name = name;
  }

  /**
   * 책 이름을 반환한다.
   *
   * @return 책이름
   */
  public String getName() {
    return name;
  }
}
