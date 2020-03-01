package mediator;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Mediator 인터페이스를 구현한 로그인 다이얼로그를 나타내는 클래스 */
public class LoginFrame extends Frame implements ActionListener, Mediator {
  private static final long serialVersionUID = 1L;
  private ColleagueCheckbox checkGuest;
  private ColleagueCheckbox checkLogin;
  private ColleagueTextField textUser;
  private ColleagueTextField textPass;
  private ColleagueButton buttonOk;
  private ColleagueButton buttonCancel;

  public LoginFrame(String title) {
    super(title);
    setBackground(Color.lightGray);
    setLayout(new GridLayout(4, 2));
    createColleagues();
    add(checkGuest);
    add(checkLogin);
    add(new Label("Username:"));
    add(textUser);
    add(new Label("Password:"));
    add(textPass);
    add(buttonOk);
    add(buttonCancel);
    colleagueChanged(checkGuest);
    pack();
    setVisible(true);
  }

  /** 멤버인 colleague들을 생성하여 배치한다. */
  public void createColleagues() {
    // colleague들을 생성한다.
    CheckboxGroup g = new CheckboxGroup();
    checkGuest = new ColleagueCheckbox("Guest", g, true);
    checkLogin = new ColleagueCheckbox("Login", g, false);
    textUser = new ColleagueTextField("", 10);
    textPass = new ColleagueTextField("", 10);
    textPass.setEchoChar('*');
    buttonOk = new ColleagueButton("OK");
    buttonCancel = new ColleagueButton("Cancel");

    // 카운셀러인 mediator를 설정한다.
    checkGuest.setMediator(this);
    checkLogin.setMediator(this);
    textUser.setMediator(this);
    textPass.setMediator(this);
    buttonOk.setMediator(this);
    buttonCancel.setMediator(this);

    // 리스너를 설정한다.
    checkGuest.addItemListener(checkGuest);
    checkLogin.addItemListener(checkLogin);
    textUser.addTextListener(textUser);
    textPass.addTextListener(textPass);
    buttonOk.addActionListener(this);
    buttonCancel.addActionListener(this);
  }

  /** Colleague로부터의 통지로 각 멤버의 유효/무효를 판정한다. */
  public void colleagueChanged(Colleague c) {
    if (c == checkGuest || c == checkLogin) {
      if (checkGuest.getState()) {
        textUser.setColleagueEnabled(false);
        textPass.setColleagueEnabled(false);
        buttonOk.setColleagueEnabled(true);
      } else {
        textUser.setColleagueEnabled(true);
        userpassChanged();
      }
    } else if (c == textUser || c == textPass) {
      userpassChanged();
    } else {
      System.out.println("colleagueChanged:unknown colleague = " + c);
    }
  }

  /** textUser 또는 textPass의 변경이 있는 경우 처리한다. */
  private void userpassChanged() {
    if (textUser.getText().length() > 0) {
      textPass.setColleagueEnabled(true);
      if (textPass.getText().length() > 0) {
        buttonOk.setColleagueEnabled(true);
      } else {
        buttonOk.setColleagueEnabled(false);
      }
    } else {
      textPass.setColleagueEnabled(false);
      buttonOk.setColleagueEnabled(false);
    }
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println(e);
    System.exit(0);
  }
}
