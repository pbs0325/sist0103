package day0108;

import java.util.Scanner;

public class QuizFor_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//1.
		System.out.println("1. 1 2 4 5 7 8 10 (continue활용할 것!!)");

		for(int n=1;n<=10;n++)
		{
			if(n%3==0)
				continue;
			System.out.print(n+"  ");
		}
		
//2.		
		System.out.println("  ");
		for(int n=0;n<=10;++n)
		{
			if(n%2==0)
				continue;
			System.out.println("홀수값:"+n);
		}
		
//3.
		int score;
		int sum=0;

		while(true)
		{	
			System.out.println("점수를 입력하세요");
			score=sc.nextInt();

			if(score==0)
				break;

			if(score<0||score>100)
			{
				System.out.println("다시 입력해 주세요");
				continue;
			}

			sum+=score;
		}
		
		System.out.println(sum);

	}

}
