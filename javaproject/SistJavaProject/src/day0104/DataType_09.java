package day0104;

public class DataType_09 {

	public static void main(String[] args) {
		// args를 이용한 연산
		
		int java=Integer.parseInt(args[0]);
		int jsp=Integer.parseInt(args[1]);
		int spring=Integer.parseInt(args[2]);
		
		//계산
		int tot=java+jsp+spring;
		int count=3;
		
		double avg1=tot/count;
		double avg2=(double)tot/count;
		
		System.out.println(avg1);
		System.out.println(avg2);
		
		System.out.printf("평균은 %.0f점",avg1);
		

	}

}
