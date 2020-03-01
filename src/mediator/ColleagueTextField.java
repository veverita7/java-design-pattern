package mediator;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/** Colleague 인터페이스를 구현한 텍스트를 입력하는 클래스 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {
  private static final long serialVersionUID = 1L;
  private Mediator mediator;

  /** 텍스트와 칼럼수를 받아 생성한다. */
  public ColleagueTextField(String text, int columns) {
    super(text, columns);
  }
  /** 카운셀러인 mediator를 설정한다. */
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  /** mediator의 지시에 따라 상태를 변경한다. */
  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
    setBackground(enabled ? Color.white : Color.lightGray);
  }

  /** 문자열이 변경되면 mediator에게 알려준다. */
  public void textValueChanged(TextEvent e) {
    mediator.colleagueChanged(this);
  }
}
