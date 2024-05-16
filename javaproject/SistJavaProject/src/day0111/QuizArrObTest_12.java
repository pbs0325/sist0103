package day0111;

class MyInfo{
	
	private String name;
	private String mbti;
	private int age;
	
	public void MyInfo() {
		
	}
	
	public void MyInfo(String name, String mbti, int age)
	{
		this.name=name;
		this.mbti=mbti;
		this.age=age;
	}
	
	public static void mbtiText()
	{
		System.out.println("이름\tMBTI\t나이");
		System.out.println("========================");
	}
	
	public void mbtiRead()
	{
		System.out.println(name+"\t"+mbti+"\t"+age+"세");
	}
}

public class QuizArrObTest_12 {

	public static void main(String[] args) {
		
		MyInfo [] mb = new MyInfo[4];
		
	
		MyInfo.mbtiText();
		
		
	}
	
}
