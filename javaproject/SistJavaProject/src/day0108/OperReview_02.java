package day0108;

import java.util.Calendar;
import java.util.Scanner;

public class OperReview_02 {
	
	public static void main(String[] args) {
		// 띠: 로직에서 사용하는 순서는 원숭이
		// 원숭이 닭 쥐 소 호랑이 토끼 용 뱀 말 양 개 돼지
		
		Scanner sc=new Scanner(System.in);
		
		int birth,age;
		String name,ddi;
		
		System.out.println("이름입력");
		name = sc.nextLine();
		
		System.out.println("태어난 연도 입력");
		birth = sc.nextInt();
		
		Calendar cal=Calendar.getInstance();
		age=cal.get(cal.YEAR)-birth;
		
		ddi=birth%12==0?"원숭이":
			birth%12==1?"닭":
				birth%12==2?"개":
					birth%12==3?"돼지":
						birth%12==4?"쥐":
							birth%12==5?"소":
								birth%12==6?"호랑이":
									birth%12==7?"토끼":
										birth%12==8?"용":
											birth%12==9?"뱀":
												birth%12==10?"말":"양";
		System.out.println("이름:"+name);
		System.out.println("나이:"+age+"세");
		System.out.println("띠:"+ddi+"띠");
														
												
		
	}

}
