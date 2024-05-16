package day0108;

public class ForGugu_14 {

	public static void main(String[] args) {
	//중첩 for문 이용한 구구단
		
	loop1: for(int i=2;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
				{
				if(i==5)
					break loop1;
				System.out.println(i+"x"+j+"="+i*j);
				}	
				
			System.out.println();
		}
	}
	
}
