package day0111;

class Apple{

	public Apple() {
		System.out.println("Apple_디폴트 생성자");
	}
}

class Banana{

	public Banana(String str) {
		System.out.println("생성자 호출:"+str);
	}
}


class Orange{

	public Orange() {
		System.out.println("Orange의 디폴트 생성자호출");
	}
	public Orange(String str) {
		System.out.println("Orange의 2번째 생성자:"+str);
	}
	public Orange(int n) {
		this(); //3번째 생성자가 디폴트 생성자를 호출했다
		//this("홍길동"); //3번째 생성자가 2번째 생성자를 호출했다
		System.out.println("Orange의 3번째 생성자:"+n);
	}

}

public class ConstTest_02 {

	public static void main(String[] args) {

		Apple apple=new Apple();
		Banana banana=new Banana("난 바나나다");
		Orange orange=new Orange();
		Orange orange2=new Orange("난 오렌지다");
		Orange orange3=new Orange('ㅁ');
	}

}
