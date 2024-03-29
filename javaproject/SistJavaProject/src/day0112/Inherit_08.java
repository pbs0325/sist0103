package day0112;

//부모클래스
class Car{
	
	private String carCompany; //제조회사
	private String carkind; //종류
	
	public Car(String company, String kind) {
		this.carCompany=company;
		this.carkind=kind;
	}
	
	public Car() {
		this("현대","아이오닉5");
	}
	
	public void writeData() {
		System.out.println("회사명:"+this.carCompany);
		System.out.println("종류:"+this.carkind);
	}

	public String getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	public String getCarkind() {
		return carkind;
	}

	public void setCarkind(String carkind) {
		this.carkind = carkind;
	}


}

//////////////////////////
//자식클래스
class MyCar extends Car{
	
	private String carName;
	private String carColor;
	private int carPrice;
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public MyCar() {
		
	}

	public MyCar(String company, String kind, String name, String color, int price) {
		super(company, kind);
		this.carName=name;
		this.carColor=color;
		this.carPrice=price;
		
	}
	
	@Override
	public void writeData() {
		super.writeData();
		System.out.println("자동차명:"+carName);
		System.out.println("색상:"+carColor);
		System.out.println("가격:"+carPrice);
	}
}


public class Inherit_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCar c1= new MyCar("현대","전기차","아이오닉5","블랙",35000000);
		System.out.println("**명시적 생성자로 생성**");
		c1.writeData();
		
		System.out.println();
		System.out.println("**디폴트 생성자로 생성**");

		MyCar c2= new MyCar();
		Car c3= new Car();
		c3.setCarCompany("기아");
		c3.setCarkind("가솔린");
		c2.setCarColor("빨강");
		c2.setCarName("코나");
		c2.setCarPrice(45000000);
		c2.writeData();
	}

}
