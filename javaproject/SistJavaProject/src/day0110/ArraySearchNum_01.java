package day0110;

import java.util.Scanner;

public class ArraySearchNum_01 {

	public static void main(String[] args) {
		// 배열중에서 숫자찾기
		// 있는지 찾기, 없으면 없다고 있으면 몇번째 있는지 출력
		// 0입력시 종료
		
		int [] data = {23,62,77,12,74,23,68,94,84,37};
		
		boolean flag;
		
		Scanner sc = new Scanner(System.in);
		int su;
		
		while(true)
		{
			System.out.println("숫자 입력하세요");
			su = sc.nextInt();
			
			//0입력시 종료
			if(su==0)
			{
				System.out.println("종료!!!");
				break;
			}
			
			flag=false; //찾으면 true로 변경
			
			//값찾기
			for(int i=0;i<data.length;i++)
			{
				if(su==data[i])
				{
					flag=true;
					System.out.println(i+1+"번째에서 검색");
				}
			}
			
			if(!flag) //flag==false
			{
				System.out.println("이 수는 데이터에 없습니다");
			}
		}
	}

}
