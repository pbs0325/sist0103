package day0112;

class Shop{
	
	static int num;
	private int price;
	private String name;
	private String color;
	
	public Shop (int num, int price, String name, String color)
	{
		this.num=num;
		this.price=price;
		this.name=name;
		this.color=color;
		
	}
	
	//제어문
	public static void showTitle() 
	{
		System.out.println("[쌍용교육센터 매장 입고상품]");
		System.out.println();
		System.out.println("번호\t상품명\t가격\t색상");
		System.out.println("=================================");
	}

	public void showSangPums()
	{
		num++;
		System.out.println(num+"\t"+name+"\t"+price+"\t"+color);
	}
}



public class ArrReview_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Shop [] shop= {
				/*new Shop(1,"아령",25000,"black"),
				new Shop(2,"요가매트",25000,"black"),
				new Shop(3,"레깅스",25000,"black"),
				new Shop(4,"나시",25000,"black"),*/
				
		};
	}

}
