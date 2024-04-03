package day0111;

class Manggo{
	
	private String writter;
	private String subject;
	private static String mes="Happy Day!!";
	
	//setter,getter
	public String getWritter() {
		return writter;
	}
	public void setWritter(String writter) {
		this.writter = writter;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public static String getMes() {
		return mes;
	}
	
}

public class ObTest_09 {

	public static void writeManggo(Manggo m) 
	{
		System.out.println("[망고 클래스 출력]");
		System.out.println("작성자:"+m.getWritter());
		System.out.println("제목:"+m.getSubject());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("망고클래스 메세지 출력");
		System.out.println(Manggo.getMes());
		
		Manggo m1=new Manggo();
		m1.setWritter("박범수");
		m1.setSubject("오늘 놀자");
		
		Manggo m2=new Manggo();
		m2.setWritter("김범수");
		m2.setSubject("좋지");
		
		//같은 클래스 내의 static메서드 호출은 클래스명 생략가능하다
		writeManggo(m1);
		writeManggo(m2);
	}

}
