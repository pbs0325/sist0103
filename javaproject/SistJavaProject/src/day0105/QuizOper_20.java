package day0105;

import java.util.Scanner;

public class QuizOper_20 {

	public static void main(String[] args) {
		
		/* 5개 이상 구매 시 10% 할인
		 * 상품명: 키보드
		 * 수량: 5
		 * 가격: 20000
		 * =================
		 * 5개 이상 구매 시 10% 할인됩니다.
		 * 키보드 5개는 총 100000원 입니다.
		 * 할인 된 금액: 10000원 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5개 이상 구매 시 10% 할인");
		System.out.println("상품명:");
		String pro = sc.nextLine();
		System.out.println("수량:");
		int count = sc.nextInt();
		System.out.println("가격:");
		int price = sc.nextInt();
		System.out.println("=============");
		
		int all = count*price;
		
		System.out.printf("키보드 %d개는 총 %d원 입니다.\n",count,price*count);
		
		if(count>=5)
			System.out.printf("할인 된 금액: %d원 입니다",all/10);
		else
			System.out.println("할인 된 금액: 0원 입니다");
				
	}
}
