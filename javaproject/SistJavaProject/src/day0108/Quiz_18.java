package day0108;

import java.util.Scanner;

public class Quiz_18 {

	public static void main(String[] args) {

		//quiz_1();
		quiz_2();
	}





	public static void quiz_1() {
		/*Q.반복해서 숫자를 입력하여 양수의 갯수와 음수의 갯수를 구하시오.(0 입력 시 종료)
		*
		*
		*/
		
		Scanner sc = new Scanner(System.in);
	
		int plus=0;
		int minus=0;
		System.out.println("음수와 양수를 입력하세요:");
		
		while(true)
		{
		
		int a=sc.nextInt();
		
		if(a==0)
			break;
		
		if(a>0)
			plus++;
		else
			minus++;
		
		}
		
		System.out.println("양수의 갯수:"+plus);
		System.out.println("음수의 갯수:"+minus);
		
		
	}

	public static void quiz_2() {

		//반복해서 점수를 입력하고(1~100) 0을 입력시 빠져나와 갯수와 합계와 평균을 구하시오
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum=0;
		double avg;
		
		System.out.println("1~100사이의 정수를 입력하세요.:");
		
		while(true)
		{
			int a = sc.nextInt();
			
			
			if(a==0)
				break;
			
			if(a>100||a<1)
				{System.out.println("1~100사이의 정수만 입력할 수 있습니다.");
				continue;
				}
			
			num++;
			sum+=a;
			
		}
	avg=sum/num;
	System.out.println("갯수는"+num+"합계는"+sum+"평균은"+avg+"입니다.");
	}
}