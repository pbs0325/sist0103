package day0109;

public class ForStar_02 {

	public static void main(String[] args) {
		//
		System.out.println("**다중 for문으로 star(*) 출력하기**");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
}
