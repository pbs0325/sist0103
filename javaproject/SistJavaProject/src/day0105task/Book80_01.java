package day0105task;

import java.util.Scanner;

public class Book80_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money;
		int ma=10000,ch=10000,ba=1000,si=100,il=10;
		
		System.out.println("알바비는 얼마인가요?");
		money=sc.nextInt();
		
		System.out.println("만원:"+(money/ma));
		System.out.println("천원:"+(money%ch)/1000);
		System.out.println("백원:"+(money%ba)/100);
		System.out.println("십원:"+(money%si)/10);
		System.out.println("일원:"+(money%il)/1);
		
		
	}

}
