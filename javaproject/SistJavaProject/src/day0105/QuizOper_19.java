package day0105;

import java.util.Scanner;

public class QuizOper_19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하십쇼");
		String name = sc.nextLine();
		
		System.out.println("국영수 점수를 입력하세요");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		int sum = kor+eng+mat;
		double avg = sum/3;
		
		
		System.out.println("=====================");
		System.out.printf("%s님의 기말고사 성적",name);
		//총점:
		//평균:
		//평가:
		
		switch ((sum/3)/10)
		{
		case 9:
			System.out.println("평가: 참 잘했습니다");
			break;
		case 8:
			System.out.println("평가: 잘했습니다");
			break;
		case 7:
			System.out.println("평가: 굳");
			break;
		case 6:
			System.out.println("평가: 분발하세요");
			break;
		default:
			System.out.println("평가: 흠...");
			break;
		
		}
		
		System.out.println("총점:"+sum);
		System.out.printf("평균:%.1f",avg);
		
	}

}
