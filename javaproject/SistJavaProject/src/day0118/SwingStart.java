package day0118;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class SwingStart extends JFrame{
	
	Container cp;
	
	
	public SwingStart(String title) {
		super(title); 
		
		cp=this.getContentPane();
		
		this.setBounds(300, 100, 400, 400);
		cp.setBackground(new Color(230,220,100));
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingStart("스윙시작");

	}

}
