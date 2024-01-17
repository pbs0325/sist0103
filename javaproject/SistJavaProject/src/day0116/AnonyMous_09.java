package day0116;

abstract class AbstObj{
	abstract public void dataIn();
	abstract public void dataOut();
}
////////////////
class SubAbst extends AbstObj{

	@Override
	public void dataIn() {
		// TODO Auto-generated method stub
		System.out.println("상속_데이터 입력");	
	}
	@Override
	public void dataOut() {
		// TODO Auto-generated method stub
		System.out.println("상속_데이터 출력");
	}
}
////////////////
public class AnonyMous_09 {
	
	//익명내부클래스
	AbstObj ab1 =new AbstObj() {
		
		@Override
		public void dataOut() {
			// TODO Auto-generated method stub
			System.out.println("익명내부클래스_데이터 출력");
		}
		
		@Override
		public void dataIn() {
			// TODO Auto-generated method stub
			System.out.println("익명내부클래스_데이터 입력");
		}
		
	};
	
	SubAbst su=new SubAbst();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//익명내부클래스
		
		AnonyMous_09 an9 = new AnonyMous_09();
		an9.ab1.dataIn();
		an9.ab1.dataOut();
		
		//상속받은 클래스
		an9.su.dataIn();
		an9.su.dataOut();
	}

}
