package day0105;

import java.util.Scanner;

public class OperTest_08 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("당신의 이름은?");
		String name=sc.nextLine();
		
		System.out.println("키는?");
		double height=sc.nextDouble();
		
		System.out.println("몸무게는?");
		int weight=sc.nextInt();
		
		System.out.printf("%s님의 권장 몸무게는 %.1f키로 입니다.",name,(height-100)*0.9);
		
	}
	
}
