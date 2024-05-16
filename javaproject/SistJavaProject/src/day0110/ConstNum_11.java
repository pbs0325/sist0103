package day0110;


//생성자(Constructor): 객체 생성시 자동호출되는 메서드
//1. 일반메서드와 차이점: 리턴형이 없다
//2. 반드시 클래스명과 같다
//3. Overloding이 가능하다(여러개의 생성자 만들수있다)
//4. 생성자가 없을 경우 기본생성자로 생성가능
//5. 멤버값들의 초기화를 담당
class Numb {

	int num;
	public Numb() {
		System.out.println("디폴트 생성자 호출");
	}
	
	public Numb(int num) {
		this.num=num;
		System.out.println("인자있는 생성자 호출");
	}
	
	public int getNumber() {
		num=50;
		return num;
	}
}

public class ConstNum_11 {
	
	public static void main(String[] args) {
		
	Numb n1=new Numb();
	
	Numb n2=new Numb(30);
	System.out.println(n2.num);
		
	Numb n3=new Numb();
	System.out.println(n3.getNumber());
	}
	
}
