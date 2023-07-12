package day0712;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


@SuppressWarnings("serial")
public class TestBorder extends JFrame {
	
	public TestBorder() {
		super("border의 연습");
		
		JPanel jpLeft = new JPanel();
		JPanel jpRight = new JPanel();
		
		// Border 설정
		
//		jpLeft.setBorder(new LineBorder(Color.RED));// Constant
		jpLeft.setBorder(new LineBorder(new Color(0xFAB07A)));// RGB를 활용
		jpRight.setBorder(new TitledBorder("버튼을 클릭해보세요."));
		
		JButton jbtnLeft = new JButton("왼쪽");
		JButton jbtnRight = new JButton("오른쪽");
		JButton jbtnRight2 = new JButton("오른쪽2");
		
		jpLeft.add(jbtnLeft);
		jpRight.add(jbtnRight);
		jpRight.add(jbtnRight2);
		
		setLayout(new GridLayout(1,2));
		
		add(jpLeft);
		add(jpRight);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new TestBorder();
		
	}

}
