package day0112;

interface InterA{
	
	public void singasong();
	public void draw();
	
}

interface InterB{
	public void playgame();
	public void write();
}
///////////////////////////
class Imple implements InterA,InterB{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}@Override
	public void playgame() {
		// TODO Auto-generated method stub
		
	}@Override
	public void singasong() {
		// TODO Auto-generated method stub
		
	}@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
}
///////////////////////////
public class InterImple_14 {

	public static void main(String[] args) {
		// 하위클래스 생성
		Imple im=new Imple();
		im.draw();
		im.singasong();
		im.playgame();
		im.write();
		
		
		Imple im2=new Imple();
		im2.draw();
		im2.singasong();
		im2.playgame();
		im2.write();
		
		
		
		// 다형성 생성

	}

}
