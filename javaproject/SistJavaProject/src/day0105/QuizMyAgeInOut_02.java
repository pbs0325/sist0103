package day0105;

import java.util.Calendar;
import java.util.Scanner;

public class QuizMyAgeInOut_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		String name,area;
		int born;
		int year=cal.get(cal.YEAR);
		
		System.out.println("이름이 뭔가요?");
		name=sc.nextLine();
		
		System.out.println("태어난 연도는 뭔가요?");
		born=Integer.parseInt(sc.nextLine());
		
		System.out.println("태어난 지역은 어디인가요?");
		area=sc.nextLine();
		
		System.out.println("==================");
		System.out.println("[박범수 님의 개인정보]");
		System.out.println("==================");
		System.out.println("이름:"+name);
		System.out.println("태어난년도:"+born);
		System.out.println("나이:"+(year-born));
		System.out.println("지역:"+area);	
	}
}
