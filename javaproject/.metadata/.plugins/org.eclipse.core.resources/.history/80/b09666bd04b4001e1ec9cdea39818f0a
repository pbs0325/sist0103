package day0113;

import java.util.Scanner;

interface Command{
	public void write();
}

class Insert implements Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("입력합니다");	
	}

}

class List implements Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("출력합니다");
	}
}

class Modify implements Command{
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("수정합니다");	
	}
}

class Delete implements Command{
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("삭제합니다");	
	}
}

public class InheritBoard_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Command com=null;

		int n;

		exit: while (true)
		{
			System.out.println("1.추가 2.출력 3.수정 4.삭제");
			System.out.println("============");
			n=sc.nextInt();

			switch (n)
			{
			case 1:

				com=new Insert();
				break;
			case 2:

				com=new List();
				break;
			case 3:

				com=new Modify();
				break;
			case 4:

				com=new Delete();
				break;
			default:
				System.out.println("종료합니다.");
				break exit;
			}
			
			if(n<=4)
				com.write();
			else
				break exit;
		}
	}

}

