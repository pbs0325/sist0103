package day0105;

import java.util.Scanner;

public class Equal_15 {
	
	public static void main(String[] args) {
		
	//문자열 비교는 관계연산자 사용 x
	//equals() 메서드 이용해서 비교 가능
		
		Scanner sc = new Scanner(System.in);
		
		String word; //입력 단어
		
		System.out.println("영어단어를 입력해보세요");
		System.out.println("ex) happy,rose,dragon,angel,music");
		word=sc.nextLine();
		
		System.out.println("입력한 단어: "+word);
		
		if(word.equals("angel"))
			System.out.println("당신은 천사입니다");
		else if(word.equals("happy"))
			System.out.println("당신은 행복할겁니다 ");
		else if(word.equals("dragon"))
			System.out.println("당신은 저주에 걸렸습니다 ");
		else if(word.equals("rose"))
			System.out.println("당신은 꽃입니다 ");
		else if(word.equals("music"))
			System.out.println("지금은 수업시간입니다 정숙하세요 ");
		else
			System.out.println("등록되지 않은 단어입니다.");
	
	}

}
