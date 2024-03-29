package day0116;

import java.util.Scanner;

class SawonOuter{
	
	private String sawonName;
	private int gibonPay, familySu, timeSu;
	
	public void process()
	{
		//데이터 입력
		
		//결과출력
	}
	
	class InputInner{
		
		public void inputData() 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("사원명 입력");
			sawonName=sc.nextLine();
			System.out.println("기본급?");
			gibonPay=sc.nextInt();
			System.out.println("초과시간은?");
			timeSu=sc.nextInt();
			System.out.println("가족수는?");
			familySu=sc.nextInt();
		}
	}
	
	class SudangInner{
		
		public int getTimeStdang()
		{
			return timeSu*30000;
		}
		
		public int getFamilySudang()
		{
			if(familySu<=4)
				return 200000;
			else
				return 300000;
		}
		
		public int getTex() 
		{
			return (int)(gibonPay*0.03);
			
		}
		
		public int getTotalPay() {
			return gibonPay+getFamilySudang()+getTimeStdang()-getTex();
		}
		
		public void writeSawonData()
		{
			System.out.println("사원명\t기본급\t초과근무시간\t가족수\t시간수당\t가족수당\t세금\t총급여");
			System.out.println(sawonName+"\t"+gibonPay+"\t"+timeSu+"\t"+familySu+"\t"+getTimeStdang()+"\t"+getFamilySudang()+"\t"+getTex()+"\t"+getTotalPay());
		}
	}
}

public class QuizInnerClass_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SawonOuter so=new SawonOuter();
		
		SawonOuter.InputInner inin = so.new InputInner();
		
		inin.inputData();
		SawonOuter.SudangInner suin = so.new SudangInner();
		
		suin.writeSawonData();
	}

}
