package day0108;

public class For_09 {

	public static void main(String[] args) {
		
		for(int i=1;i<=20;i++)
		{
			//5의 배수 빼고 출력
			if(i%5==0)
				continue;
			System.out.println(i+" ");
		}
		
	}
	
}
