package day0116;

import day0116.Outer.Inner1;

class Outer
{
	String name="박범수";
	int age=22;
	
	//member 내부1
	class Inner1{

		//내부클래스에서 외부클래스의 멤버변수사용 가능하다
		public void disp() {
			System.out.println("Inner1 내부클래스");
			System.out.println("이름:"+name+",나이:"+age+"세");
		}
	}
	
	//member 내부2
	class Inner2{
		
		public void disp2() {
			System.out.println("Inner2 내부클래스");
			System.out.println("이름:"+name+",나이:"+age+"세");
		}
	}

	public void write() {
		Inner1 in1 = new Inner1();
		in1.disp();
	}
}

public class InnerObj_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer out=new Outer();
		out.write();
		
		System.out.println("다른클래스에서 외부 통하지않고 직접 내부클래스 메서드 호출하는 법은?");
		
		Outer.Inner1 in1 = new Outer().new Inner1();
		in1.disp();
	}

}
