package builder;

/** 하나의 문서를 만드는 클래스 */
public class Director {
  private Builder builder;

  /**
   * Builder 클래스를 받아 생성한다.
   *
   * @param builder 문서 작성에 사용할 Builder
   */
  public Director(Builder builder) {
    this.builder = builder;
  }

  /**
   * 문서를 만들어 반환한다.
   *
   * @return 문서
   */
  public Object construct() {
    builder.makeTitle("인사말");
    builder.makeString("아침과 낮에");
    builder.makeItems(new String[] {"좋은 아침입니다", "안녕하세요"});
    builder.makeString("밤에");
    builder.makeItems(new String[] {"안녕하세요", "안녕히주무세요", "안녕히계세요"});
    return builder.getResult();
  }
}
