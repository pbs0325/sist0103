package day0108task;

public class QuizGugu_02 {

	public static void main(String[] args) {
		
		for(int d=2;d<=9;d++)
		{
			System.out.print("["+d+"단]\t");
		}
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=9;i++)
		{
			for(int d=2;d<=9;d++)
			{
				System.out.print(d+"x"+i+"="+d*i+"\t");
			}
			System.out.println();

		}
		
	}
	
}
