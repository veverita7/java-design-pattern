package iterator;

/** Iterator 인터페이스의 구현체이다. */
public class BookShelfIterator implements Iterator {
  private BookShelf bookShelf;
  private int index;

  /**
   * 생성자로서 반복의 대상이 되는 책장(BookShelf)를 인자로 받는다.
   *
   * @param bookShelf 반복의 대상이 되는 책장
   */
  public BookShelfIterator(BookShelf bookShelf) {
    this.bookShelf = bookShelf;
    this.index = 0;
  }

  /**
   * Iterator 인터페이스의 구현체이다. 현재 인텍스의 책이 존재하는지 확인한다.
   *
   * @return 책이 있으면 True 없으면 False
   */
  public boolean hasNext() {
    if (index < bookShelf.getLength()) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Iterator 인터페이스의 구현체이다. 책장이 가지고 있는 책의 다음 요소를 반환하고 책장에 대한 인덱스값을 증가시킨다.
   *
   * @return 현재 인덱스가 가르키는 책
   */
  public Object next() {
    Book book = bookShelf.getBookAt(index);
    index++;
    return book;
  }
}
