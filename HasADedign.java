package day0712;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// 1. Window Component 상속, 이벤트를 처리할 Listener를 구현
@SuppressWarnings("serial")
public class HasADedign extends JFrame {

	public HasADedign() {
		super("has a 이벤트 안녕 스윙~");
		
		// 2. 컴포넌트 생성
		JButton jbtn = new JButton("헬로 스윙~");
		
		// 3. 이벤트에 등록
		HasAEvent hae = new HasAEvent(this);// 디자인 클래스와 이벤트 클래스가 has a 관계
		jbtn.addActionListener(hae);// 이벤트를 등록하고 처리될 객체를 설정
		
		// 3. 배치
		add(jbtn);
		
		// 4. 윈도우 크기 설정
		setSize(300,250);
		
		// 5. 사용자에게 보여주기
		setVisible(true);
		
		// 6. 윈도우 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new HasADedign();
		
		
	}
	
}
