package day0108;

public class For_10 {
	
	public static void main(String[] args) {
		
		int i=1;
		
		for(;i<=10;i++)
		{
			System.out.print(i+"  ");
		}
		
		System.out.println("\nfor문 빠져나온 i의 값:"+i);
		
		int n=1;
		for(;n<=10;n++)
		{
			if(n%2==1)
				continue;
				System.out.print(n+" ");
		}
		System.out.println();
		
	}

}
