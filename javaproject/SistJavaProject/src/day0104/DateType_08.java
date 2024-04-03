package day0104;

public class DateType_08 {
	
	public static void main(String[] args) {
		//묵시적형변환은 자동으로 결정되는 타입
		//String+int=String
		//double+int=double
		//long+short=long
		
		
		char a='a';
		
		System.out.println(a+32);
		System.out.println("Happy"+5+6);
		System.out.println("Happy"+(5+6));
		System.out.println('a'+0);
		System.out.println('b'+0);
		System.out.println('a'+'b');
		
	}

}
