package day0115;

import java.util.Scanner;
import java.util.Vector;

public class ShopArrayList {

	java.util.List<Shop> list=new Vector<Shop>();

	//입력 메서드
	public void inputData() {
		Scanner sc=new Scanner(System.in);
		String sangName;
		int dan, su;

		System.out.println("상품명?");
		sangName=sc.nextLine();
		System.out.println("가격?");
		dan=sc.nextInt();
		System.out.println("수량?");
		su=sc.nextInt();

		Shop data=new Shop(sangName, su, dan);
		list.add(data);

		System.out.println(list.size()+"개의 상품을 입고했어요!");
	}
	
	
	//출력 메서드
	private void writeData() 
	{
		
		
		System.out.println("no.\t상품명\t가격\t수량\t총액");	
		System.out.println("-----------------------------------");
		for(int i=0;i<list.size();i++)
		{
			Shop b=list.get(i);
			System.out.println((i+1)+"\t"+b.getSangName()+"\t"+b.getDan()+"\t"+b.getSu()+"\t"+b.getAll());
			System.out.println("--------------------------------------");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShopArrayList sa=new ShopArrayList();
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true)
		{
			System.out.println("1.상품입고 2.상품재고 3.종료");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1)
				sa.inputData();
			else if(n==2)
				sa.writeData();
			else if(n==3)
			{	System.out.println("종료합니다");
				break;
			}
		}

	}

}
