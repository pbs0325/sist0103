package day0111;

class Member {
	
	private String stuName;
	private String stuGender;
	private String stuAddr;
	
	static String ban;
	static int cnt;
	
	//멤버메서드(수정)메서드
	public void setMemberData(String name, String gender, String addr) 
	{
		this.stuName=name;
		this.stuAddr=addr;
		this.stuGender=gender;
	}
	
	//출력메서드
	public void writeMemberData()
	{
		cnt++;
		System.out.println("[학생"+cnt+"정보]");
		System.out.println("소속학급:"+Member.ban);
		System.out.println("이름:"+this.stuName);
		System.out.println("성별:"+this.stuGender);
		System.out.println("주소:"+this.stuAddr);
	}
}

public class StaticObTest_05 {
	
	public static void main(String[] args) {
		
		Member m1=new Member();
		Member m2=new Member();
		
		m1.setMemberData("박범수", "여자", "서울시 관악구");
		m2.setMemberData("김범수", "남자", "서울시 강남구");
		
		Member.ban="쌍용교육센터 JAVA반";
		
		m1.writeMemberData();
		m2.writeMemberData();
		
	}

}
