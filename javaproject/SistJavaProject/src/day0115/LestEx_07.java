package day0115;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class LestEx_07 {

	public static void main(String[] args) {
		// 1.순차적으로 데이터 들어감
		// 2.중복 데이터 허용
		// 3.처음 생성시 일정한 갯수로 배열이 할당됨. 그 이상의 데이터를 넣으면 자동으로 공간이 늘어난다.

		//List<String> list=new Vector<String>();
		Vector<String> list=new Vector<String>();
		//생성자가 디폴트인경우 기본 할당크기 10
		System.out.println("초기 할당크기:"+list.size());
		System.out.println("초기 할당크기"+list.capacity());
		
		list.add("장미");
		list.add("장미");
		list.add("수국");
		list.add("프리지아");
		list.add("장미");
		list.add("안개꽃");		
	
		System.out.println("출력1");
		for(int i=0;i<list.size();i++)
		{
			String s=list.get(i);
			System.out.printf("%3s",s);
		}
		
		System.out.println("출력2");
		for(String s:list)
			System.out.print(s+"	");
		System.out.println();
		
		System.out.println("출력3");
		Iterator<String> iter=list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next()+"  ");
		System.out.println();
		
		System.out.println("출력4");
		
		Object [] ob=list.toArray();
		for(int i=0;i<ob.length;i++)
		{
			String s=(String)ob[i];
			System.out.println(s+" ");
		}
	}

}
