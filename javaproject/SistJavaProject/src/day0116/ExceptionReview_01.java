package day0116;

public class ExceptionReview_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("안녕하세요..");
		System.out.println("3초뒤에 저는 갑니다.");
		
		try {
		Thread.sleep(3000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("잘가~");
	}

}
