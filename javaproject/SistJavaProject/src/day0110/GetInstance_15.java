package day0110;

class Test{
	
	private Test() {
		System.out.println("디폴트 생성자");
	}
	
	//생성자 대신 인스턴스를 반환해주는 메서드
	public static Test getInstance()
	{
		return new Test();
	}
}


public class GetInstance_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
