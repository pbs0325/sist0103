package javaproject;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import day0131.ShopDto;
import javaproject.JavaProjectAdd.PhotoDraw;






public class JavaProject extends JFrame implements ActionListener {

	JavaDbModel jdbModel=new JavaDbModel();
	Vector<JavaDto> list;
	JPanel jp = new JPanel();
	DefaultTableModel model;
	JTable table;
	ImageDraw draw=new ImageDraw();
	String imageName;
	JButton jbAdd = new JButton("사원추가");
	JButton jbUpdate = new JButton("사원수정");
	JButton jbSearch = new JButton("사원검색");
	JButton jbDelete = new JButton("사원삭제");
	

	public JavaProject() {
		super("인사관리");
		this.setBounds(300,100,1000,600);
		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(null);

		list=jdbModel.getAllSawon();

		String [] title={"No.","이름","성별","부서","직급","주소","월급","E-mail","입사일"};
		model=new DefaultTableModel(title,0);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10, 10, 965, 400);
		this.add(js);

		//이미지위치
		draw.setBounds(520, 50, 160, 220);
		this.add(draw);
		
		this.dataWrite();
		
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int row=table.getSelectedRow();
				
				//list에서 row에 해당하는 dto를 꺼내서 거기에서 이미지명을 얻는다
				imageName=list.get(row).getPhoto();
				
				//이미지나오게하는 메서드 호출
				draw.repaint();
				super.mouseClicked(e);
				
			}
		});




		jbAdd.setBounds(800,450,100,30);
		this.getContentPane().add(jbAdd);
		jbAdd.addActionListener(this);

		jbUpdate.setBounds(630,450,100,30);
		this.getContentPane().add(jbUpdate);
		jbUpdate.addActionListener(this);

		jbSearch.setBounds(460,450,100,30);
		this.getContentPane().add(jbSearch);
		jbSearch.addActionListener(this);

		jbDelete.setBounds(290,450,100,30);
		this.getContentPane().add(jbDelete);
		jbDelete.addActionListener(this);
	}

	public void dataWrite() {
		// TODO Auto-generated method stub
		//테이블 기존데이터 삭제
		model.setRowCount(0);
		
		//테이블에 데이터 추가하기
		for(JavaDto dto:list)
		{
			Vector<String> data=new Vector<String>();
			
			data.add(dto.getName());
			data.add(dto.getPhoto());
			data.add(dto.getGender());
			data.add(dto.getDept());
			data.add(dto.getPosition());
			data.add(dto.getAddr());
			data.add(String.valueOf(dto.getPay()));
			data.add(dto.getEmail());
			data.add(dto.getIpsaday());
			
			//테이블 모델 추가
			model.addRow(data);
		}
	}
	class ImageDraw extends Canvas{

		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);

			if(imageName!=null)
			{
				Image image=new ImageIcon(imageName).getImage();
				g.drawImage(image, 0, 0, 160, 200, this);
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();

		if(ob==jbAdd)
		{
			System.out.println("사원추가");

			JavaProjectAdd add=new JavaProjectAdd();

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

		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JavaProject();
	}



}
