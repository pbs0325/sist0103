package javaproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import day0131.ShopAddForm;
import day0131.ShopListForm;


public class JavaProject extends JFrame implements ActionListener {

	
	JPanel jp = new JPanel();
	JButton jbAdd = new JButton("사원추가");
	JButton jbUpdate = new JButton("사원수정");
	JButton jbSearch = new JButton("사원검색");
	JButton jbDelete = new JButton("사원삭제");

	public JavaProject() {
		super("인사관리");
		this.setBounds(300,100,600,600);
		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(null);


		jbAdd.setBounds(430,500,100,30);
		this.getContentPane().add(jbAdd);
		jbAdd.addActionListener(this);

		jbUpdate.setBounds(300,500,100,30);
		this.getContentPane().add(jbUpdate);
		jbUpdate.addActionListener(this);

		jbSearch.setBounds(430,450,100,30);
		this.getContentPane().add(jbSearch);
		jbSearch.addActionListener(this);

		jbDelete.setBounds(300,450,100,30);
		this.getContentPane().add(jbDelete);
		jbDelete.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();

		if(ob==jbAdd)
		{
			System.out.println("사원추가");

			//ShopAddForm add=new ShopAddForm();
		}else if(ob==jbDelete)
		{
			System.out.println("사원삭제");
			//String num=JOptionPane.showInputDialog("삭제할 num을 입력해주세요");
			//dbModel.deleteSangpum(num);

		}else if(ob==jbUpdate)
		{
			System.out.println("사원수정");
		}else if(ob==jbSearch)
		{
			System.out.println("사원검색");
			//ShopListForm listForm=new ShopListForm();
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JavaProject();
	}



}
