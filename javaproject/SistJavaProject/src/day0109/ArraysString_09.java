package day0109;

public class ArraysString_09 {

	public static void main(String[] args) {
		
		String [] str;
		str=new String[4];
		
		//초기화
		str[0]="박범수";
		str[1]="김범수";
		str[2]="이범수";
		str[3]="조범수";
		
		//출력
		System.out.println("출력1_for");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(i+":"+str[i]);
		
		}
		System.out.println("출력1_foreach");
		for(String s:str)
		{
			System.out.println(s);
		}
	}
	
}
