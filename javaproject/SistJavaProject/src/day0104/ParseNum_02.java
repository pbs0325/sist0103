package day0104;

public class ParseNum_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String su1="8";
		String su2="2";
		System.out.println("두 수 더하기:"+(su1+su2));
		int s1=Integer.parseInt(su1);
		int s2=Integer.parseInt(su2);
				
		System.out.println("변환 후 두 수 더하기:"+(s1+s2));
		System.out.println("변환 후 두 수 빼기:"+(s1-s2));
		System.out.println("변환 후 두 수 곱하기:"+(s1*s2));
		System.out.println("변환 후 두 수 나누기:"+(s1/s2));
	}

}
