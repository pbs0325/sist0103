package day0109;

public class QuizInOutRank_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name= {"홍수연","박범수","박동재","박주영"};
		int [] kor= {90,100,70,32};
		int [] eng= {40,100,60,100};
		int [] mat= {50,100,90,100};
		int [] tot= new int[4];
		double [] avg = new double[4];
		int [] rank= new int[4];
		
		/*
		 * 각 학생들의 점수에 대한 총점 평균 등수를 구하여 출력하세요
		 * 
		 * 번호	이름	국어 	영어 수학 총점 평균 등수
		 * =================================
		 * 1	홍수연 90 40 50 ** ** *
		 */
	
		//1. 총점 평균..배열
		
		//등수
		
		//
		
		System.out.println("각 학생들의 점수에 대한 총점 평균 등수를 구하여 출력하세요");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("==============================================================");
		
		for(int i=0;i<tot.length;i++)
			{
			tot[i]=kor[i]+eng[i]+mat[i];
			}
		
		for(int i=0;i<avg.length;i++)
			{
			avg[i]=tot[i]/3;
			}
		
		
		for(int i=0;i<4;i++)
			{
			rank[i]=1;
			
			for(int j=0;j<4;j++)
				{
					if(tot[i]<tot[j])
						rank[i]++;
				}
			}
		
		
		for(int i=0;i<4;i++)	
		System.out.println((i+1)+"\t"+name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+avg[i]+"\t"+rank[i]);
		
		
		
		
	}

}
