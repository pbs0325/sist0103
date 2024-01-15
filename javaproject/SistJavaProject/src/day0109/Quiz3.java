package day0109;

public class Quiz3 {

	public static void main(String[] args) {
		//1~100까지의 숫자중 짝수의 합과 홀수의 합을 출력해주세요.
		
		int esum=0;
		int osum=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				esum+=i;
			else
				osum+=i;
		}
		
		System.out.println("짝수의 합:"+esum);
		System.out.println("홀수의 합:"+osum);
	}
	
}
