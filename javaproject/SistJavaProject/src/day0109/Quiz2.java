package day0109;

import java.util.Scanner;

public class Quiz2 {
	
	public static void main(String[] args) {
		
		/* Q. 두수 x,y를 입력후 x의 y승 _for문을 이용해서 구하시오(x를 y횟수만큼 곱하는 것)
		 * 
		 * 두수 입력
		 * 3	3
		 * 3의 3승은 27입니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("제곱 계산기/ 두 수를 입력하세요");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int c=1;
		
		for(int i=0;i<b;i++)
		{
			c*=a;
		}
		
		System.out.println(c);
		
		
	}

}
