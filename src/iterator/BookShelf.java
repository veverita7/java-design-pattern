package iterator;

/** 책장을 표현하는 클래스이다. Aggregate 인터페이스를 구현한다. */
public class BookShelf implements Aggregate {
  private Book[] books;
  private int last = 0; // 책의 총 갯수

  /**
   * 책장을 생성한다. 책장을 생성할때에는 책장의 크기(가질 수 있는 책의 갯수)를 정한다.
   *
   * @param maxsize 책장의 크기
   */
  public BookShelf(int maxsize) {
    this.books = new Book[maxsize];
  }

  /**
   * 책장에서 index번째에 있는 책을 반환한다.
   *
   * @param index 꺼내려는 책의 순서
   * @return 책장에 들어가 있던 책
   */
  public Book getBookAt(int index) {
    return books[index];
  }

  /**
   * 책을 책장에 추가한다.
   *
   * @param book 책장에 추가하는 책
   */
  public void appendBook(Book book) {
    this.books[last] = book;
    last++;
  }

  /**
   * 책장에 있는 책의 총 갯수를 반환한다.
   *
   * @return 책의 총 갯수
   */
  public int getLength() {
    return last;
  }

  /**
   * 책장 클래스에서 책을 반복적으로 가져올 수 있는 반복자(Iterator)를 반환한다.
   *
   * @return BookShelf의 반복자
   * @see BookShelfIterator
   */
  public Iterator iterator() {
    return new BookShelfIterator(this);
  }
}
