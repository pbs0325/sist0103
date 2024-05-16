package day0104;

import java.util.Scanner;

public class KeyBoardIn_14 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("이름을 입력해 보세요==>");
		name=sc.nextLine();
		
		System.out.print("나이를 입력하세요==>");
		age=Integer.parseInt(sc.nextLine());
		//숫자입력후 엔터 누르면 그 엔터가 키보드 버퍼로 저장되어 다음문자열 읽을때 먼저 읽어버리는 현상발생
		//그래서 다음문자열 읽기전에 엔터 읽어서 없애기 sc.nextLine()
		
		System.out.println("당신이 사는 지역은?");
		String city=sc.nextLine();
		
		System.out.println(name+"님의 나이는"+age+"살 입니다.");
		
	}
	
}
