package day0112;

//interface는 상수와 추상메서드만 가질수 있다
//class가 class를: extends
//class가 interface를: implement
//interface가 interface를: extends7201
interface FoodShop{
	
	String SHOPNAME="남소관"; //final 생략 
	public void order(); //추상메서드들이다... abstract생략
	public void bedal();
}
/////////////////////////////
class Food2 implements FoodShop{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		//SHOPNAME은 상수이기 때문에 수정안됨
		System.out.println("음식을 주문합니다");
	}

	@Override
	public void bedal() {
		// TODO Auto-generated method stub
		
	}

}
/////////////////////////////
class Food3 implements FoodShop{
	
	@Override
	public void bedal() {
		// TODO Auto-generated method stub
	System.out.println("키오스크 주문");	
	}
	
	@Override
	public void order() {
		// TODO Auto-generated method stub
	System.out.println("쿠팡이츠 배달");
	}
}


public class Implement_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodShop fs;
		fs=new Food2();
		fs.order();
		fs.bedal();
		
		fs=new Food3();
		fs.order();
		fs.bedal();
	}

}
