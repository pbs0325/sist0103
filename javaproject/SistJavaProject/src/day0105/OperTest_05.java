package day0105;

public class OperTest_05 {

	public static void main(String[] args) {
		// 비교연산자: >,<,>=,<=,!=,==
		//and:&&  or:||  not:!

		int a=5,b=4,c=8;

		System.out.println(a>c);
		System.out.println(a==c);
		System.out.println(a<c);
		System.out.println(!(a==c));
		System.out.println(a!=c);
		System.out.println(a>c&&c>b);
		System.out.println(a>c||c>b);

		boolean bool=false;

		System.out.println("a="+bool);
		System.out.println("b="+!bool);

		boolean bool2=5>3;

		System.out.println("c="+bool2);
		System.out.println("c="+!bool2);
		System.out.println("c="+!(5>3));

	}
}
