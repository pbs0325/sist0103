package day0109;

public class ArrMaxNum_13 {

	public static void main(String[] args) {
		
		int [] data= {58,8,16,86,45,83,11,35,78,27};
		
		System.out.println("갯수:"+data.length);
		
		int max = data[0]; //첫 데이터를 무조건 최대값에 지정
		int min = data[0];
		
		//두번째 데이터부터 끝까지 max와 비교
		for(int i=1;i<data.length;i++)
		{
			if(max<data[i])
				max=data[i];
			
			if(min>data[i])
				min=data[i];
		}
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}
	
}
