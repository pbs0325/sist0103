package day0108;

public class Sum_11 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
		sum+=i;
		}
		
		System.out.println("1~10까지의 합은:"+sum);
	
	//while
		
		int n=1;
		int tot=0;
		
		while(n<=10)
		{
			tot+=n;
			n++;
		}
		
		System.out.println("1~10까지의 합은:"+tot);
	
	
	
	}
	
}
