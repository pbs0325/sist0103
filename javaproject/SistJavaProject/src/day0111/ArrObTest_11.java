package day0111;

class Shop{
	private String sangpum;
	private int price;
	private String sangcolor;
	public char[] showTitle;
	
	public Shop() {
		// TODO Auto-generated constructor stub
	}
	
	public Shop(String s, int p, String c) {
		this.sangpum=s;
		this.price=p;
		this.sangcolor=c;
	}
	
	//제목
	public static void showTitle()
	{
		System.out.println("상품명\t가격\t색상");
		System.out.println("=========================");
	}
	
	//생성한 갯수만큼 출력
	public void showShop()
	{
		System.out.println(sangpum+"\t"+price+"\t"+sangcolor);
	}
}

public class ArrObTest_11 {

	public static void main(String[] args) {
		// 4개 생성해서 출력할것
		Shop [] sh = new Shop[4];
		
		sh[0]=new Shop("가위", 7500, "black");
		sh[1]=new Shop("풀", 1400, "green");
		sh[2]=new Shop("연필", 700, "yellow");
		sh[3]=new Shop("지우개", 1200, "white");
		
		Shop.showTitle();
		
		for(int i=0;i<sh.length;i++)
		{
			Shop sss=sh[i];
			sss.showShop();
		}
	}

}
