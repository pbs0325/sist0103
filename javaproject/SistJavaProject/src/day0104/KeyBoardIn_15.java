package day0104;

import java.util.Scanner;

public class KeyBoardIn_15 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String stuName;
		int kor,eng,mat;
		int tot;
		double avg;
		
		System.out.println("학생명?");
		stuName=sc.nextLine();
		System.out.println("국영수 점수를 입력하세요");
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		
		tot=kor+eng+mat;
		avg=tot/3.0;
		
		System.out.println("_____________");
		System.out.println("학생명:"+stuName);
		System.out.println("국어"+kor);
		System.out.println("영어"+eng);
		System.out.println("수학"+mat);
		System.out.println("합계"+tot);
		System.out.println("평균"+avg);
		
		
		
	}
	
}
