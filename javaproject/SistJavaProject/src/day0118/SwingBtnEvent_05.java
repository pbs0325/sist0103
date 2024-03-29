package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingBtnEvent_05 extends JFrame implements ActionListener{

	Container cp;
	private JButton btn2,btn1;
	public SwingBtnEvent_05(String title) {
		super(title); 

		cp=this.getContentPane();

		this.setBounds(300, 100, 400, 400);
		cp.setBackground(new Color(230,220,100));
		this.setVisible(true);
		
		initDesign();
		
		this.setVisible(true);
	}

	public void initDesign() 
	{
		this.setLayout(new FlowLayout());

		btn1=new JButton("◀");
		btn2=new JButton("▶");
		
		this.add(btn1);
		this.add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		Object ob=e.getSource();

		if(ob==btn1)
			JOptionPane.showMessageDialog(this,"왼쪽" );
		else if(ob==btn2)
			JOptionPane.showMessageDialog(this,"오른쪽" );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingBtnEvent_05("스윙시작");


	}

}
