package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEvent_07 extends JFrame {

	Container cp;
	JButton btn1,btn2;

	public SwingEvent_07(String title) {
		super(title);

		cp=this.getContentPane();

		this.setBounds(300, 100, 400, 400);
		cp.setBackground(new Color(100,220,100));
		initDesign();

		this.setVisible(true);
	}

	private void initDesign() 
	{
		//Flow 레이아웃으로 버튼2개 생성
		this.setLayout(new FlowLayout());

		btn1=new JButton("(●'◡'●)");
		btn2=new JButton("(*/ω＼*)");

		this.add(btn1);
		this.add(btn2);

		//버튼1생성및 이벤트주기(익명내부클래스 형식)
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//getContentPane().setBackground(Color.green);
				cp.setBackground(Color.green);
			}


		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//getContentPane().setBackground(Color.green);
				cp.setBackground(Color.red);
			}


		});

		//버튼색상 그레이로 변경, 버튼색상 그린으로 변경
		btn1.setBackground(Color.PINK);
		btn2.setBackground(Color.orange);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingEvent_07("버튼이벤트_07");
	}

}
