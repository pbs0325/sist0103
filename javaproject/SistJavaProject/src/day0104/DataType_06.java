package day0104;

public class DataType_06 {
	
	public static void main(String[] args) {
		//기본 자료형 8개
		
		boolean flag=false; //논리형 true,false
		
		//문자형
		//반드시 하나의 문자, 16바이트 유니코드 값 표현
		//2바이트 문자하나
		//기본적으로 정수형, 아스키코드로 변경 가능
		//''로 표현
		char ch='가';
		
		//정수형
		byte a=-128;
		short b=32000;
		int c=2100000;
		long d=9200000000l;
		
		System.out.println("flag= "+flag);
		System.out.println("ch= "+ch);
		System.out.println("byte= "+a);
		System.out.println("short= "+b);
		System.out.println("int= "+c);
		System.out.println("long= "+d);
		
		float f=3.1234f;
		
		double g=23456.243124;
		
		System.out.println("실수형 float= "+f);
		System.out.println("실수형 double= "+g);
		
	}

}
