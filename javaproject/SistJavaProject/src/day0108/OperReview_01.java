package day0108;

import java.util.Scanner;

public class OperReview_01 {
	
	public static void main(String[] args) {
		// import,선언,입력,계산,출력
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng,mat;
		
		System.out.println("이름:");
		name=sc.nextLine();
		System.out.println("국영수 점수:");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		double avg = (kor+eng+mat)/3.0;
		
		/*System.out.println("3과목 점수:"+kor+","+eng+","+mat);
		System.out.printf("평균 %5.4f\n",avg);
		
		System.out.println("**합격조건: 평균이 60점 이상이고, 각 과목 모두 40점 이상이면 합격***");
		
		if(avg>=60&&kor>=40&&eng>=40&&mat>=40)
			System.out.println(name+"님은 합격입니다.");
		else
			System.out.println(name+"님은 불합격입니다.");*/
		
		//삼항연산자 복습
		/*System.out.printf("평균: %5.1f\n",avg);
		System.out.println("**평가: 80점이상: 매우잘함 / 70점이상: 아슬함 / 70점미만: 탈락");
		System.out.println("평가:"+(avg>=80?"매우잘함":avg>=70?"아슬함":"탈락"));*/
		
		//
		
		
	}

}
