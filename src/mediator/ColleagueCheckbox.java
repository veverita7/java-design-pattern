package mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/** Colleague 인터페이스를 구현한 체크박스를 나타내는 클래스 */
public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
  private static final long serialVersionUID = 1L;
  private Mediator mediator;

  /** 문자열과 체크박스그룹, 값을 받아 생성한다. */
  public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
    super(caption, group, state);
  }

  /** 카운셀러인 mediator를 설정한다. */
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  /** mediator의 지시에 따라 상태를 변경한다. */
  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
  }

  /** 값이 변경되면 mediator에게 알려준다. */
  public void itemStateChanged(ItemEvent e) {
    mediator.colleagueChanged(this);
  }
}
