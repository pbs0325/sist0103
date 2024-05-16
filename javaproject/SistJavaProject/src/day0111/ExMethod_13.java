package day0111;

/*
 * 메서드: 접근제한자(public)+지정예약어(static)+결과형리턴값(void)+메서드명()
 * 반복적인 콛를 줄여 코드의 관리가 쉽다
 * 하나의 메서드는 한가지 기능만 수행하도록 작성 
 */
public class ExMethod_13 {

	public static boolean aaa()
	{
		return false;
	}
	
	public static int bbb()
	{
		return 11;
	}
	
	public static int ccc(int x,int y)
	{
		int z=x+y;
		return z;
	}
	
	//메서드는 오버로딩이 가능하다
	public static int sum(int a,int b)
	{
	System.out.println("1번째 함수호출");	
	return 0;
	}
	
	public static double sum(int a,double b)
	{
	System.out.println("2번째 함수호출");	
	return a+b;
	}
	
	public static double sum(double a,int b)
	{
	System.out.println("3번째 함수호출");	
	return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a =aaa();
		System.out.println("a="+a);
		
		int b = bbb();
		System.out.println("b="+b);
		
		int c=ccc(20,30);
		System.out.println("c="+c);
		
		//sum
		System.out.println(sum(3,4));
		System.out.println(sum(3,4.4));
		System.out.println(sum(3.5,4));

	}

}
