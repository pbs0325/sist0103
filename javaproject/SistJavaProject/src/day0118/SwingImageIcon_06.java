package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingImageIcon_06 extends JFrame implements ActionListener {

	Container cp;

	//이미지 아이콘 가져오기
	ImageIcon icon1=new ImageIcon("C:\\sist0103\\image\\swingimage\\LEFT.GIF");
	ImageIcon icon2=new ImageIcon("C:\\sist0103\\image\\swingimage\\leftDown.GIF");
	ImageIcon icon3=new ImageIcon("C:\\sist0103\\image\\swingimage\\leftRollover.GIF");
	ImageIcon icon4=new ImageIcon("C:\\sist0103\\image\\swingimage\\chick.GIF");
	ImageIcon icon5=new ImageIcon("C:\\sist0103\\image\\swingimage\\img4.GIF");
	
	JButton btn1,btn2,btn3,btn4;

	public SwingImageIcon_06(String title) {

		super(title);

		cp=this.getContentPane();
		
		this.setBounds(300, 100, 400, 400);
		cp.setBackground(new Color(100,220,100));
		initDesign();
		this.setVisible(true);
	}
	
	private void initDesign() 
	{	
		//2행 2열
		this.setLayout(new GridLayout(2, 2));
		btn1=new JButton("hello",icon1);
		btn1.setHorizontalTextPosition(JButton.CENTER); //텍스트 가로위치
		btn1.setVerticalTextPosition(JButton.BOTTOM); //텍스트 세로위치
		this.add(btn1);
		
		btn1.setRolloverIcon(icon2);
		btn1.setPressedIcon(icon3);
		
		//버튼2
		btn2=new JButton(icon4);
		this.add(btn2);
		
		btn3=new JButton("스윙버튼");
		this.add(btn3);
		
		btn4=new JButton("안녕",icon5);
		this.add(btn4);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob=e.getSource(); //버튼의 어떤 메서드 호출인지 정확히 지정해주어야함
		
		//메세지를 다이얼로그형태로 보여준다
		//JOptionPane.showMessageDialog(this, "버튼클릭!!!");
		
		//버튼마다 다른 메세지 출력하려면?
		if(ob==btn1)
			JOptionPane.showMessageDialog(this, "그래");
		else if(ob==btn2)
			JOptionPane.showMessageDialog(this, "오오");
		else if(ob==btn3)
			JOptionPane.showMessageDialog(this, "오");
		else if(ob==btn4)
			JOptionPane.showMessageDialog(this, "그래");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingImageIcon_06("스윙시작");
	}

}
