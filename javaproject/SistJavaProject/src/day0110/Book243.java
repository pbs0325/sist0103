package day0110;

class Car{
	
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed=speed;
	}
	
	void run() {
		this.setSpeed(100);
		System.out.println(this.model+"가 달립니다.(시속:"+this.speed+"km/h)");
	}
}


public class Book243 {
	
	public static void main(String[] args) {
		
	Car c1 = new Car("포르쉐");
	Car c2 = new Car("벤츠");
	
	c1.run();
	c2.run();
	
		
	}

}
