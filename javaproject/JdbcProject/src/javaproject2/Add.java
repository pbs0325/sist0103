package javaproject2;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javaproject2.Dto;

public class Add extends JFrame implements ActionListener {
/////////////////////////////////클래스 선언 & 변수 선언
	JTextField tfName, tfGender, tfDept, tfPosition, tfAddr,
	tfPay, tfEmail,tfIpsaday;
	JButton btnImage, btnInsert, btnCancel;
	String imageName;
	DataBase db = new DataBase();
	Dto dto=new Dto();
	
	
//////////////////////////////////사원추가 jframe 생성
	public Add() {
		super("사원추가");
		this.setBounds(300, 100, 400, 520);
		initDesign();
		this.setVisible(true);
	}	
	
	
//////////////////////////////////사원추가 버튼생성 & 디자인 생성
	private void initDesign() {
		this.setLayout(null);

		JLabel lbl1=new JLabel("사원이름");
		lbl1.setBounds(40, 30, 150, 30);
		this.add(lbl1);
		
		tfName=new JTextField();
		tfName.setBounds(110, 30, 230, 30);
		this.add(tfName);
		
		JLabel lbl2=new JLabel("사진선택");
		lbl2.setBounds(40, 70, 150, 30);
		this.add(lbl2);
		
		btnImage=new JButton("사진선택");
		btnImage.setBounds(110,70,230,30);
		this.add(btnImage);
		btnImage.addActionListener(this);
		
		JLabel lbl3=new JLabel("성별");
		lbl3.setBounds(40, 110, 150, 30);
		this.add(lbl3);
		
		tfGender=new JTextField();
		tfGender.setBounds(110, 110, 230, 30);
		this.add(tfGender);
		
		JLabel lbl4=new JLabel("부서");
		lbl4.setBounds(40, 150, 150, 30);
		this.add(lbl4);
		
		tfDept=new JTextField();
		tfDept.setBounds(110, 150, 230, 30);
		this.add(tfDept);
		
		JLabel lbl5=new JLabel("직책");
		lbl5.setBounds(40, 190, 150, 30);
		this.add(lbl5);
		
		tfPosition=new JTextField();
		tfPosition.setBounds(110, 190, 230, 30);
		this.add(tfPosition);
		
		JLabel lbl6=new JLabel("주소");
		lbl6.setBounds(40, 230, 150, 30);
		this.add(lbl6);
		
		tfAddr=new JTextField();
		tfAddr.setBounds(110, 230, 230, 30);
		this.add(tfAddr);
		
		JLabel lbl7=new JLabel("월급");
		lbl7.setBounds(40, 270, 150, 30);
		this.add(lbl7);
		
		tfPay=new JTextField();
		tfPay.setBounds(110, 270, 230, 30);
		this.add(tfPay);
		
		JLabel lbl8=new JLabel("이메일");
		lbl8.setBounds(40, 310, 150, 30);
		this.add(lbl8);
		
		tfEmail=new JTextField();
		tfEmail.setBounds(110, 310, 230, 30);
		this.add(tfEmail);
		
		JLabel lbl9=new JLabel("입사일 ex) yy-mm-dd");
		lbl9.setBounds(40, 350, 150, 30);
		this.add(lbl9);
		
		tfIpsaday=new JTextField();
		tfIpsaday.setBounds(190, 350, 150, 30);
		this.add(tfIpsaday);
		
		btnInsert = new JButton("사원추가");
		btnInsert.setBounds(200, 410, 150, 30);
		btnInsert.addActionListener(this);
		this.add(btnInsert);
		
		btnCancel = new JButton("취소");
		btnCancel.setBounds(40, 410, 150, 30);
		btnCancel.addActionListener(this);
		this.add(btnCancel);
	}
	
	
	
	
/////////////////////////////////버튼에 action 부여
	@Override
	public void actionPerformed(ActionEvent e) {
Object ob=e.getSource();

		/////사진선택 버튼 action
		if(ob==btnImage)
		{
			
			
			FileDialog dlg=new FileDialog(this, "이미지 가져오기", FileDialog.LOAD);
			dlg.setVisible(true);
			
			if(dlg.getDirectory()==null)
				return;
			
			imageName=dlg.getDirectory()+dlg.getFile();
			
			btnImage.setText(imageName);
		}
		/////사원추가 버튼 action
		else if(ob==btnInsert) {
			//shopDto 생성
			Dto dto=new Dto();
			
		/////dto에 4개의 데이터를 넣는다
			dto.setName(tfName.getText());
			dto.setPhoto(imageName);
			dto.setGender(tfGender.getText());
			dto.setDept(tfDept.getText());
			dto.setPosition(tfPosition.getText());
			dto.setAddr(tfAddr.getText());
			dto.setPay(Integer.parseInt(tfPay.getText()));
			dto.setEmail(tfEmail.getText());
			dto.setIpsaday(tfIpsaday.getText());
		
		/////db모델에서 insert메서드 호출
			db.insertSawon(dto);
			
		/////현재창 닫기
			this.setVisible(false);
		}
		/////cancel 버튼 action
		else if(ob==btnCancel) {
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Add();
	}

}
