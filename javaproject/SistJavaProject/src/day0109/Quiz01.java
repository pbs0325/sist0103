package day0109;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 팩토리얼 구할 숫자를 입력하여 해당숫자에 대한 팩토리얼 구하기
		// 팩토리얼 구할 숫자 입력
		// 5
		// 5! = 120
		
		Scanner sc = new Scanner(System.in);
		
		int a,b = 1;
		System.out.println("숫자를 입력하세요.");
		a = sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			b*=i;	
		}
		
		System.out.println(b);
	}

}
