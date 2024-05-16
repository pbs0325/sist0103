package day0104;

public class ArgsParse_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name=args[0];
		//int java=args[1];
		//args는 string 값으로 반환 받기때문에 int args는 안된다.
		int java=Integer.parseInt(args[1]);
		// integer.parseint를 이용해 int를 사용가능하다.
		int oracle=Integer.parseInt(args[2]);
		
		//변수를 이용한 출력
		System.out.println("내 이름은"+name+"입니다.");
		System.out.println("자바 점수는"+java+"입니다.");
		System.out.println("오라클 점수는"+oracle+"입니다.");
		System.out.println("두 과목의 합계는"+(java+oracle)+"점 입니다.");
		
		
	}

}
