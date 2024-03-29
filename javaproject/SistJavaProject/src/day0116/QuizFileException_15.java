package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class QuizFileException_15 {
	
	public static void fileRoad() {
		String fName="C:/sist0103/file/fruitshop.txt";
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(fName);
			br=new BufferedReader(fr);
			int score=0;
			
			System.out.println("--과일입고목록--");
			System.out.println("번호\t과일명\t수량\t단가\t총금액");
			System.out.println("--------------------------------------");
			while(true)
			{
				String s=br.readLine();
				
				if(s==null)
					break;
				String [] data=s.split(",");
				int quantity = Integer.parseInt(data[1]);  // 수량을 정수로 변환
				int unitPrice = Integer.parseInt(data[2]); // 단가를 정수로 변환
				score++;
				System.out.println(score+"\t"+data[0]+"\t"+data[1]+"\t"+data[2]+"\t"+(quantity*unitPrice));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fileRoad();
	}

}
