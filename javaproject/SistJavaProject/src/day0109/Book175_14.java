package day0109;

import java.util.Scanner;

public class Book175_14 {

	public static void main(String[] args) {
		//학생명과 점수를 입력하고 몇명인지 입력해 주는 만큼
		//등수를 구한다
		//입력해 준 데이터로 출력을 하고 합계, 평균도 구해보자
		
		
		int stu;
		String [] name;
		int [] score;
		int [] rank;
		
		int tot=0;
		double avg=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("인원수를 입력하시오");
		stu=Integer.parseInt(sc.nextLine());
		
		//인원수만큼 배열로 할당
		
		name=new String[stu];
		score=new int[stu];
		rank=new int[stu];
		
		//인원수만큼 데이터 입력
		for(int i=0;i<stu;i++)
		{
			System.out.println((i+1)+"번 이름");
			name[i]=sc.nextLine();
			System.out.println((i+1)+"번 점수");
			score[i]=Integer.parseInt(sc.nextLine());
			
			//총점
			tot+=score[i];
		}
		for(int i=0;i<stu;i++)
		{
			rank[i]=1;
			
			for(int j=0;j<stu;j++)
			{
			if(score[i]<score[j])
				rank[i]++;
			}
		}
		
		
		avg=(double)tot/stu;
		
		System.out.println("번호\t이름\t점수");
		System.out.println("==========================");
		
		
		for(int i=0;i<stu;i++)
		{
			System.out.println((i+1)+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
		
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);
		
		
		
		
		
		
		
		/*int[] scores = {12,52,69};
		
		int sum=0;
		for(int i=0;i<scores.length;i++)
		{
			sum+=scores[i];
		}
		
		System.out.println("총합:"+sum);*/
	}

}
