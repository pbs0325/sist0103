package day0104;

import java.util.Scanner;

public class QuizKeyBoardin_16 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String phone;
		int cost, count;
		int tot;
		
		System.out.println("상품명을 입력하세요==>");
		phone=sc.nextLine();
		System.out.println("가격은 얼마입니까?==>");
		cost=Integer.parseInt(sc.nextLine());
		System.out.println("수량은 몇개입니까?==>");
		count=Integer.parseInt(sc.nextLine());
		
		tot = cost*count;
		
		System.out.println("\t[상품입고]");
		System.out.println("==========================");
		System.out.println("상품명:"+phone);
		System.out.println("가격:"+cost);
		System.out.println("수량:"+count);
		System.out.println("총가격:"+tot);
		System.out.println("==========================");
	}
	
	
}
