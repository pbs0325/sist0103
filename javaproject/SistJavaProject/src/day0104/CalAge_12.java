package day0104;

import java.util.Calendar;

public class CalAge_12 {

	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();
		
		String name=args[0];
		
		int caly=cal.get(Calendar.YEAR);
		
		int myyear=Integer.parseInt(args[1]);
		
		int myage=caly-myyear;
		
		System.out.println("이름: "+name);
		System.out.println("태어난년도: "+myyear+"년 입니다.");
		System.out.println("나이: "+(caly-myyear)+"살 입니다.");	

	}

}
