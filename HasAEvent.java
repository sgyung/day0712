package day0712;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * has a 관계로 이벤트를 처리하기 위해서는 Design 객체를 받아와야 한다.
 * @author USER
 */
public class HasAEvent implements ActionListener {

	private HasADedign had;
	
	public HasAEvent(HasADedign had) {
		this.had = had;
	}
	
	@Override
	// 2. 이벤트를 처리할 수 있는 abstract method를 Override
	public void actionPerformed(ActionEvent e) {
		// 3. 이벤트 처리 코드를 기술
		JOptionPane.showMessageDialog(had, "안녕하세요? 이벤트 입니다.");
	}
	
}
