package javaproject2;

<<<<<<< HEAD
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

=======
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javaproject2.Dto;

public class Main extends JFrame implements ActionListener {
	//////////////////////////클래스 호출, 변수선언
	JButton Add,Update,Search,Delete;
	DataBase db;
	Vector<Dto> list;
	DefaultTableModel model;
	JTable table;
	String imageName;
	Delete delete = new Delete();
	ImageDraw draw = new ImageDraw();


	//////////////////////////메인 jframe 생성
	public Main() {
		super("인사관리");
		this.setBounds(300,100,1000,600);
		initDesign();
		this.setVisible(true);


	}

	//////////////////////////메인버튼 생성 & 디자인
	public void initDesign() {
		this.setLayout(null);



		Add=new JButton("사원추가");
		Delete=new JButton("사원삭제");
		Update=new JButton("사원수정");
		Search=new JButton("사원검색");

		Add.setBounds(800,450,100,30);
		this.getContentPane().add(Add);
		Add.addActionListener(this);

		Delete.setBounds(290,450,100,30);
		this.getContentPane().add(Delete);
		Delete.addActionListener(this);

		Update.setBounds(630,450,100,30);
		this.getContentPane().add(Update);
		Update.addActionListener(this);

		Search.setBounds(460,450,100,30);
		this.getContentPane().add(Search);
		Search.addActionListener(this);

		/////메인에 리스트 생성후 database에서 사원데이터 호출

		db = new DataBase(); // 데이터베이스 객체 생성


		list=db.getAllSawon();

		String [] title={"No.","이름","성별","부서","직급","주소","월급","E-mail","입사일"};
		model=new DefaultTableModel(title,0);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10, 10, 965, 370);
		this.add(js);

		//이미지위치
		draw.setBounds(70, 390,150,150);
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

	}

	class ImageDraw extends Canvas{

		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);

			if(imageName!=null)
			{
				Image image=new ImageIcon(imageName).getImage();
				g.drawImage(image, 0, 0, 150, 150, this);
			}
		}
	}
	//////////////////////////리스트에 데이터 추가하기
	public void dataWrite() {
		// TODO Auto-generated method stub
		//테이블 기존데이터 삭제
		model.setRowCount(0);

		//테이블에 데이터 추가하기
		for(Dto dto:list)
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
	//////////////////////////메인버튼 액션
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();

		if(ob==Add)
		{

			Add add=new Add();

			/////ShopAddForm add=new ShopAddForm();
		}else if(ob==Delete)
		{
			String num=JOptionPane.showInputDialog("삭제할 시퀀스를 입력해주세요");

			delete.deleteData(num);


		}else if(ob==Update)
		{
			System.out.println("사원수정");
		}else if(ob==Search)
		{
			System.out.println("사원검색");

		}

	}

	//////////////////////////메인	
	public static void main(String[] args) {

		new Main();
	}

>>>>>>> 89b3f39060c0703b73d3dfb1fcbaffc1286bfe64
}
