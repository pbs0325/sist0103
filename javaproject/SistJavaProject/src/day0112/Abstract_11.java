package day0112;
//추상클래스
//추상클래스는 new로 생성못함
//abstract메서드는 abstract클래스에서만 존재할 수 있다.
//abstract 클래스는 일반메서드 추상메스드 둘다 포함 가능

abstract class Fruit{
	
	public static final String MRSSAGE="오늘은 추상클래스 배우는날~";
	
	//일반메서드
	public void showTitle()
	{
		System.out.println("일반메서드 입니다.");
	}
	
	//추상메서드(미완의 메서드, 구현부가 없다)..오버라이딩이목적
	abstract public void showMessage();
}

class Apple extends Fruit{

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println(Fruit.MRSSAGE);
		System.out.println("Apple_Message");
	}
	
}
class Banana extends Fruit{
	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
	System.out.println("Banana_Message");
	}
}

class Orange extends Fruit{
	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
	System.out.println("Orange_Message");	
	}
}
public class Abstract_11 {
	
	
	public static void main(String[] args) {
		
		
		
		
		Fruit fruit;
		
		fruit=new Apple();
		fruit.showMessage();
		fruit.showTitle();
		
		fruit=new Banana();
		fruit.showMessage();
		fruit.showTitle();
		
		fruit=new Orange();
		fruit.showMessage();
		fruit.showTitle();
		
		
		//추상클래스 생성
		Fruit fr=new Fruit() {
			
			@Override
			public void showMessage() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	
	private void name() {
		
	}
	
}
