package day0110;

import java.util.Scanner;

public class ArraySearchName_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] names= {"박범수","김범수","조범수","변범수","이범수","하범수","박동재","김동재","이동재","변동재"};
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag;
		
		
		
		while(true)
		{
			System.out.println("이름을 입력하세요.");
			String a = sc.nextLine();
			
			if(a.equalsIgnoreCase("q"))
			{
			System.out.println("종료!");
			break;
			}
			
			flag=false;
			
			for(int i=0;i<=names.length;i++)
			{
				if(a.equals(names[i]))
				{
					flag=true;
					System.out.println(names[i]+"님은"+i+"번째에 있습니다.");
				}
			
			}
			if(!flag)
				System.out.println(names+"님은 테이터에 없음");
			
		}
	}

}
