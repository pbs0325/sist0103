package day0108;

import java.util.Scanner;

public class QuizForWhile_15 {

	public static void main(String[] args) {

		//test1();
		//test2();
		//test3();
		test4();
	}

	public static void test1() {
		//문제: 1~100까지의 3의 배수 갯수 구하기
		int n=0;
		int cnt=0;

		while(true) {
			n++;

			if(n%3==0)
				cnt++;


			if(n==100)
				break;
		}

		System.out.println("3의 배수 갯수:"+cnt+"개");


	}

	public static void test2() {

		//1부터 100까지의 짝수 합 구하기 (while(true))
		int i=0;
		int sum=0;

		while(true)
		{
			i++;
			if(i%2==0)
				sum+=i;

			if(i==100)
				break;
		}

		System.out.println("짝수 합:"+sum);

	}	

	public static void test3() {

		//for문 이용 1~100까지의 홀수합 구하기
		int sum=0;

		for(int i=1;i<=100;i+=2)
		{
			sum+=i;
		}

		System.out.println("홀수 합:"+sum);
	}

	public static void test4() {
		/*
		 * 1번점수: 90
		 * 2번점수: -70
		 * 잘못입력했어요
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("(1~100까지만 입력가능) 총 5개의 점수를 입력받아 합계구하기");
		
		int sum = 0;
		
		for(int i=1;i<=5;i++)
		{
			System.out.printf("%d번 점수:",i);
			int j = sc.nextInt();
			
			if(j>100 || j<0)
				{
				System.out.println("잘못입력했어요");
				i--;
				continue;
				}
			
			sum+=j;		
		}
		
		System.out.println("총점:"+sum);
	}
}
