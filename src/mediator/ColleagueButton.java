package mediator;

import java.awt.Button;

/** Colleague 인터페이스를 구현한 버튼을 나타내는 클래스 */
public class ColleagueButton extends Button implements Colleague {
  private static final long serialVersionUID = 1L;

  /** 버튼 이름을 받아 생성한다. */
  public ColleagueButton(String caption) {
    super(caption);
  }

  public void setMediator(Mediator mediator) {}

  /** mediator의 지시에 따라 상태를 변경한다. */
  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
  }
}
