package state;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Context를 구현하여 사용자 인터페이스를 표시하는 클래스 */
public class SafeFrame extends Frame implements ActionListener, Context {
  private static final long serialVersionUID = 1L;
  private TextField textClock = new TextField(60); // 현재시간
  private TextArea textScreen = new TextArea(10, 60); // 경비센터 출력
  private Button buttonUse = new Button("금고사용"); // 금고사용 버튼
  private Button buttonAlarm = new Button("비상벨"); // 비상벨 버튼
  private Button buttonPhone = new Button("일반 통화"); // 통화 버튼
  private Button buttonExit = new Button("종료"); // 종료 버튼

  private State state = DayState.getInstance(); // 현재의 상태

  /** 제목을 받아 생성한다. */
  public SafeFrame(String title) {
    super(title);
    setBackground(Color.lightGray);
    setLayout(new BorderLayout());
    add(textClock, BorderLayout.NORTH);
    textClock.setEditable(false);
    add(textScreen, BorderLayout.CENTER);
    textScreen.setEditable(false);
    Panel panel = new Panel();
    panel.add(buttonUse);
    panel.add(buttonAlarm);
    panel.add(buttonPhone);
    panel.add(buttonExit);
    add(panel, BorderLayout.SOUTH);
    pack();
    setVisible(true);
    buttonUse.addActionListener(this);
    buttonAlarm.addActionListener(this);
    buttonPhone.addActionListener(this);
    buttonExit.addActionListener(this);
  }

  // 버튼이 눌리면 호출된다.
  public void actionPerformed(ActionEvent e) {
    System.out.println(e);
    if (e.getSource() == buttonUse) {
      state.doUse(this);
    } else if (e.getSource() == buttonAlarm) {
      state.doAlarm(this);
    } else if (e.getSource() == buttonPhone) {
      state.doPhone(this);
    } else if (e.getSource() == buttonExit) {
      System.exit(0);
    } else {
      System.out.println("?");
    }
  }

  /** 시간을 설정한다. */
  public void setClock(int hour) {
    String clockstring = "현재시각은 ";
    if (hour < 10) {
      clockstring += "0" + hour + ":00";
    } else {
      clockstring += hour + ":00";
    }
    System.out.println(clockstring);
    textClock.setText(clockstring);
    state.doClock(this, hour);
  }

  /** 상태를 변경한다. */
  public void changeState(State state) {
    System.out.println(this.state + "에서 " + state + "로 상태가 변화했습니다.");
    this.state = state;
  }

  /** 경비센터를 호출한다. */
  public void callSecurityCenter(String msg) {
    textScreen.append("call! " + msg + "\n");
  }

  /** 경비센터에 기록한다. */
  public void recordLog(String msg) {
    textScreen.append("record ... " + msg + "\n");
  }
}
