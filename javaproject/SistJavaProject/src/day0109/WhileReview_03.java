package day0109;

import java.util.Scanner;

public class WhileReview_03 {

	public static void main(String[] args) {
		/*
		 * 반복적으로 나이를 입력한다 0이되면 종료
		 * 나이가 50세 이상일경우 a변수 증가
		 * 나이가 30세 이상이면 b변수 증가
		 * 그 외에는 c변수 증가
		 * 빠져나온 후 출력내용: 50세이상:3명 30세이상:2명 그외: 3명
		 */
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		while(true)
		{
			System.out.println("나이 입력");
			int age = sc.nextInt();
			
			if(age>=30&&age<50)
				b++;
			if(age>=50)
				a++;
			if(age<30&&age>0)
				c++;
			if(age==0)
				break;
		}
		
		System.out.println("50세 이상:"+a+"명/ 30세 이상:"+b+"명/ 그외:"+c+"명");
		
		
	}
	
}
