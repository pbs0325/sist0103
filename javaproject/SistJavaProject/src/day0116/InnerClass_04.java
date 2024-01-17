package day0116;

class OuterObject{

	public void disp()
	{
		System.out.println("외부클래스의 disp메서드");
		System.out.println("외부에서 내부클래스의 write 메서드 호출");
		
		InnerObject inObj=new InnerObject();
		inObj.write();
	}

	class InnerObject{

		public void write()
		{
			System.out.println("내부클래스의 write메서드");
		}
	}
}


//////////////////////////////
public class InnerClass_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterObject outObj=new OuterObject();
		outObj.disp();
		System.out.println("---------------------");
		
		//내부클래스는 외부통해서만 생성가능
		OuterObject.InnerObject obj=outObj.new InnerObject(); //new OuterObject에 이어서 생성
		
		
	}

}
