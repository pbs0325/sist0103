package day0110;

class Ipgo{
	private String sangpum;
	private int price;
	
	//set메서드
	//get메서드

	public void setsangpum(String sangpum) {
		this.sangpum=sangpum;
	}
	
	public void setprice(int price) {
		this.price=price;
	}
	
	public String getsangpum()
	{
		return sangpum;
	}
	
	public int getprice()
	{
		return price;
	}

}
public class SangpumIpgo_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ipgo i=new Ipgo();
		
		i.setsangpum("버즈2");
		i.setprice(65000);
		
		String sangpum=i.getsangpum();
		int price=i.getprice();
		
		System.out.println("상품:"+sangpum+" 가격:"+price);
	}

}
