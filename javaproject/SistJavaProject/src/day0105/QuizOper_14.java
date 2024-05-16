package day0105;

import java.util.Scanner;

public class QuizOper_14 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String check;
		
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		
		System.out.println("자바 시험점수를 입력해주세요");
		int score = sc.nextInt();
		
		/*if(score>=90)
			check="잘함";
		else if(score>=80)
			check="좋음";
		else if(score>=70)
			check="보통";
		else if(score>=60)
			check="못함";	
		else
			check="꽝!";*/
		check=score>=90?"잘함":score>=80?"좋음":score>=70?"보통":score>=60?"망함":"꽝!";
		
		
		System.out.println(name+"님의 시험평가는 "+check+" 입니다.");
		
	}
	
}
