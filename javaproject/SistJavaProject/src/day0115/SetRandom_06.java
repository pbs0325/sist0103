package day0115;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetRandom_06 {

	public static void main(String[] args) {
		// Set,random이용해서 1~45의 서로다른난수 6개
		
		Random r=new Random();
		Set<Integer> set=new HashSet<Integer>();
		
		while(true)
		{
			int n=r.nextInt(45)+1;
			set.add(n);
			
			if(set.size()==6)
				break;
		}
		
		System.out.println("출력1");
		for(int s:set)
			System.out.println(s);
		System.out.println();
		
		System.out.println("출력2");
		Iterator<Integer> iter=set.iterator();
		while(iter.hasNext())
		{
			int s=iter.next();
			System.out.println(s);
		}
		System.out.println("출력3");
		Object[] ob=set.toArray();
		Arrays.sort(ob);
		for(int i=0;i<ob.length;i++)
		{
			System.out.println(ob[i]);
		}
		
	}

}

