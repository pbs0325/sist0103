package day0112;

import day0112_1.Sawon_05;

class My extends Sawon_05{
	
	int age;
	
	public My(String name,String buseo,int age) {
		this.name=name; //부모클래스 패키지 다를경우 protected는 접근 가능/ private는 안됨
		this.buseo=buseo;
		this.age=age;
	}
	
	public void writeMy() {
		System.out.println("**My에서 만든 메서드***");
		System.out.println("사원명:"+this.name);
		System.out.println("부서:"+this.buseo);
		System.out.println("나이:"+this.age);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("나이==>"+this.age);
		System.out.println("자식이 오버라이드 한 메서드");
	}
}


public class MainSawon_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		My my1=new My("박범수","인사과",28);
		my1.writeMy();
		System.out.println();
		System.out.println("오버라이드 통해 만든 메서드 호출");
		my1.display();
	}

}
