package day0104task;

public class book71_1 {

	public static void main(String[] args) {
		//실행단계에서 상품명,수량,단가를 입력한 후 다음과 같이 출력하세요
		/*
		 * 상품명: 아이폰15
		 * 수량: 2개
		 * 단가: 1200000원
		 * 총금액: 2400000원
		 */
		
		String phone= args[0];
		int num = Integer.parseInt(args[1]);
		int pri = Integer.parseInt(args[2]);
		int result = num*pri;
		
		System.out.printf("상품명: %s\n수량: %d개\n단가: %d원\n총금액: %d원",phone,num,pri,result);
		
	}

}
