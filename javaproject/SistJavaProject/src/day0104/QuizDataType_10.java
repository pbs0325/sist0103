package day0104;

public class QuizDataType_10 {
	
	public static void main(String[] args) {
		//변수는 args를 이용할 것
		
		String name=args[0];
		String area=args[1];
		String age=args[2];
		int java= Integer.parseInt(args[3]);
		int oracle= Integer.parseInt(args[4]);
		int eva=java+oracle;
		
		
		System.out.println("학생명:"+name);
		System.out.println("지역:"+area);
		System.out.println("나이:"+age);
		System.out.println("======================================");
		System.out.printf("김선호님의 자바점수는 %d점 오라클점수는 %d점 총 %d점입니다.",java,oracle,eva);
	}

}
