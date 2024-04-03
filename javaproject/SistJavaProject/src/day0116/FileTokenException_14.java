package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTokenException_14 {

	public static void fileRoad() {
		String fName="C:\\sist0103\\file\\info.txt";
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(fName);
			br=new BufferedReader(fr);
			
			System.out.println("파일읽기 결과");
			System.out.println("이름\t주소\t나이");
			System.out.println("------------------------------");
			while(true)
			{
				String s=br.readLine();
				
				if(s==null)
					break;
				String [] data=s.split(",");
				System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]);
			}
			
		 } catch (FileNotFoundException e) {
			 e.printStackTrace();
		 } catch (IOException e) {
			 
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
