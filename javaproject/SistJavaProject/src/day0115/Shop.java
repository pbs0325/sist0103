package day0115;

public class Shop {

	/*멤버클래싀Shop
	sangName: 상품명(문자열)
	su,dan  수량,가격(정수형 숫자)
	//////////////////////////////////////
	ShopArrayList(메인클래스)
	1.ipgo 메서드_입력
	2. jego  메서드_출력
	//////////////////////////////////////////
	1.상품입고    2.상품재고      9.종료
	상품명?
	갤럭시 폴드
	가격
	 9800000
	수량
	 2
	1개의 상품을 입고했어요!!
	상품명?
	갤럭시 s7
	가격
	800000
	수량
	 4
	2개의 상품을 입고했어요!!
	2번을 쓰면 출력이 됩니다
	No.       상품명         가격        수량         총액
	1       갤럭시폴드     9500000       2   
	2       갤럿시 s      8000000       4*/
	
	private String sangName;
	private int su;
	private int dan;
	
	
	public Shop(){
		
	}
	
	public Shop(String sangName, int su, int dan) {
		this.dan=dan;
		this.sangName=sangName;
		this.su=su;
	}

	public String getSangName() {
		return sangName;
	}

	public void setSangName(String sangName) {
		this.sangName = sangName;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public int getDan() {
		return dan;
	}

	public int getAll() {
		return su*dan;
	}
	
}
