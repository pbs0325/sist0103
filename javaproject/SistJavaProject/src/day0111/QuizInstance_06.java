package day0111;

class Artist{
	
	//변수명
	private String name;
	private String song;
	
	static String com;
	static int im;
	
	//명시적생성자
	public void getArtist(String com, String name, String song) {
		this.com=com;
		this.name=name;
		this.song=song;
	}
	
	
	//출력메서드 한번에 만들기
	public void setArtist() {
		im++;
		System.out.println("**아티스트 정보_"+Artist.im+"**");
		System.out.println("소속기획사"+this.com);
		System.out.println("그룹명:"+this.name);
		System.out.println("대표곡:"+this.song);
		System.out.println("--------------------------------");
	}
	
}

public class QuizInstance_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Artist art1=new Artist();
		art1.getArtist("하이브", "BTS", "버터");
		art1.setArtist();
		Artist art2=new Artist();
		art2.getArtist("하이브", "뉴진스", "어텐션");
		art2.setArtist();
		
	}

}
