package day0105;

public class OperTest_03 {
	
	public static void main(String[] args) {
		//증감연산자 ++,--
		
		int a,b;
		a=b=5;
		
		//단항일경우 증감연상자는 앞, 뒤 상관없음.
		++a;
		b++;
		
		System.out.println("a="+a+",b="+b);
		
		//수식에서는 전치,후치 결과값 다름.
		int m,n;
		m=n=0;
		a=b=5;
		
		m=a++;
		System.out.println("m="+m+",a="+a);
		
		n=++b;
		System.out.println("n="+n+",b="+b);
	
	}

}
