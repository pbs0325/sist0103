package day0105;

public class SwitchTest_17 {
	
	public static void main(String[] args) {
		
		int a=5;
		
		//break 없으면 끝까지 진행
		switch(a)
		{
		case 1:
			System.out.println("a is 1");
			break;
		case 2:
			System.out.println("a is 2");
			break;
		case 3:
			System.out.println("a is 3");
			break;
		default:
			System.out.println("a is 입력값 없음");
			break;
		}
		
		
		char ch='A';
		
		switch(ch)
		{
		case 'a':
			System.out.println("apple");
			break;
		case 'b':
			System.out.println("banana");
			break;
		case 'c':
			System.out.println("car");
			break;
		case 'd':
			System.out.println("duck");
			break;
		default:
			System.out.println("사전에 없는 단어임");
		}
		
		String msg="HOW MUC";
		
		switch(msg)
		{
		case "HELLO":
			System.out.println("안녕");
			break;
		case "HAPPY":
			System.out.println("아 행복하다");
			break;
		case "HI":
			System.out.println("하이");
			break;
		case "HOW MUCH IS IT":
			System.out.println("얼마야?");
			break;
		default:
			System.out.println("읽씹했습니다.");
		
		}
		
	}

}
