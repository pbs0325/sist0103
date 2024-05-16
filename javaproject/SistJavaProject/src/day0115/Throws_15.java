package day0115;

import java.util.Scanner;

//Throws=호출한 영역으로 예외처리를 던짐
//Throw=강제로 예외를 발생시킬때
public class Throws_15 {

	public static void scoreInput() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int score;
		
		System.out.println("점수를 입력하세요");
		score=sc.nextInt();
		
		if(score<0 || score>100)
		{
			throw new Exception("나의 점수가 잘못되었습니다.");
		}
		else {
			System.out.println("나의 점수는"+score+"입니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			scoreInput();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류메세지:"+e.getMessage());
		}
	
		System.out.println("--정상종료--");
	}

}
