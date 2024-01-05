package day0105;

import java.util.Scanner;

public class IfTest_10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신이 좋아하는 숫자를 입력하세요");
		int a = sc.nextInt();
		
		if(a%2==0)
			System.out.println("이 숫자는 짝수입니다");
		else
			System.out.println("이 숫자는 홀수입니다");
		
		System.out.println("다음에 만나요~");
	
		//switch 문
		
		switch(a%2)
		{
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
			
		
		
			}
		
	
		}
	
	
	}

