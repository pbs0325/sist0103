package day0109;

import java.util.Scanner;

public class RandomSu_06 {

	public static void main(String[] args) {
		//1~10
		Scanner sc=new Scanner(System.in);
		
		int r =(int)(Math.random()*100)+1;
		int su; //입력할 수
		int cnt=0; //횟수 구하는 변수
		
		while(true)
		{
			cnt++;
			System.out.println(cnt+"회:");
			su=sc.nextInt();
			
			if(su>r)
				System.out.println(su+"보다 작습니다");
			else if(su<r)
				System.out.println(su+"보다 큽니다");
			else
			{
				System.out.println("맞았어요 정답은"+r+"입니다.");
				break;
			}
		}
		
	}
	
}
