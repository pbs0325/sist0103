package day0105;

import java.util.Scanner;

public class SwitchMonth_18 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int month;
		
		System.out.println("월을 입력하세요");
		month=sc.nextInt();
		
		switch (month)
		{
		case 2:
			System.out.println("28,29일까지 있습니다");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 있습니다");
			break;
		case 1: case 3: case 5:	case 7: case 8: case 10: case 12:
			System.out.println("31일까지 있습니다");
			break;
		default:
			System.out.println("없는 월입니다");
		}
		
	}

}
