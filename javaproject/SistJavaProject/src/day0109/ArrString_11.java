package day0109;

public class ArrString_11 {

	public static void main(String[] args) {
		//문자열
		
		String[] str1 = {"keyboard","우산","칫솔","grape"};
		String[] strColors = {"red","pink","파랑","회색","yellow"};
		
		//str1은 1번째: keyboard
		System.out.println("str1_출력1_for");
		for(int i=0;i<str1.length;i++)
		{
			System.out.println("str1 출력:"+str1[i]);
		}
		
		
		System.out.println("str1_출력1_foreach");
		
		for(String a:str1)
		{
			System.out.println(a);
		}
			
		
		
		//strColors 0번째색: red
		
		System.out.println("strColors_출력1_for");
		for(int i=0;i<strColors.length;i++)
		{
			System.out.println("strColors 출력:"+strColors[i]);
			
		}
		
		System.out.println("strColors_출력1_foreach");
		for(String cols:strColors)
		{
			System.out.println(cols);
		}
		
		
	}
	
}
