package day0130;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import oracledb.DbConnect;

public class SwingJS extends JFrame implements ActionListener {

	DbConnect db=new DbConnect();
	Container cp;
	
	DefaultTableModel dtm;
	JTable jt;
	JButton btnAdd, btnDel, btnUpdate;
	
	//생성자
	public SwingJS(String title)
	{
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
