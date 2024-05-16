package day0110;

class MyDate{
	
	private int year;
	private int month;
	private int day;

	//디폴트생성자
	public MyDate() {
		// TODO Auto-generated constructor stub
	}
	
	//명시적생성자_ 생성과 동시에 초기화
	public MyDate(int y,int m,int d) {
		year=y;
		month=m;
		day=d;
	}
	
	
	//setter
	public void setYear(int y)
	{
		this.year=y;
	}
	public void setmonth(int m)
	{
		this.month=m;
	}
	public void setDay(int d)
	{
		this.day=d;
	}
	//getter
	public int getyear()
	{
		return year;
	}
	public int getmonth()
	{
		return month;
	}
	public int getday()
	{
		return day;
	}

}

public class MyDate_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate m1=new MyDate(2024,01,10);
		
		int year=m1.getyear();
		int month=m1.getmonth();
		int day=m1.getday();
		
		System.out.println(year+"-"+month+"-"+day);
		
		MyDate m2=new MyDate();
		m2.setYear(2022);
		m2.setmonth(02);
		m2.setDay(31);
		
		int y= m2.getyear();
		int m=m2.getmonth();
		int d=m2.getday();
		
		System.out.println(y+"년"+m+"월"+d+"일");
	}

}
