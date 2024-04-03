package day0108task;

import java.util.Scanner;

public class QuizGugu_01 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
	 
		while(true)
		{
			System.out.println("단을 입력해주세요:");
			int dan=sc.nextInt();

			if(dan==0)
			{
				System.out.println("프로그램 종료!!");
				break;
			}

			if(dan<2||dan>9)
			{
				System.out.println("2~9단까지만 입력해주세요");
				continue;
			}


			for(int i=2;i<=9;i++)
			{
				System.out.println(dan+"x"+i+"="+dan*i);
			}
		
		}
	}
}

