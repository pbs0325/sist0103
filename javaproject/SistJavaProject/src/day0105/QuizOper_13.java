package day0105;

import java.util.Scanner;

public class QuizOper_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,max;
		
		System.out.println("숫자 세개를 입력하시오");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		/*if(a>b)
			max=a;
		else if(c>a)
			max=c;
		else
			max=b;*/
		
		max=a>b&&a>c?a:b>a&&b>a?b:c;
		
		System.out.println(max+"가 제일 큰 수입니다.");
		
		
	}
	
}
