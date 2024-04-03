package day0126;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracledb.DbConnect;

public class QuizStuinfo {

	DbConnect db=new DbConnect();
	
	public void insert()
	{
		Scanner sc=new Scanner(System.in);
		String name,gender;
		String sql="";
		int age;
		String hp;
		System.out.println("이름을 입력하시오");
		name=sc.nextLine();

		System.out.println("성별을 입력하세요");
		gender=sc.nextLine();
		
		System.out.println("나이를 입력하세요");
		age=Integer.parseInt(sc.nextLine());

		System.out.println("연락처를 입력하세요");
		hp=sc.nextLine();

		sql="insert into stuinfo values (seq_info.nextval,'"+name+"','"+gender+"',"+age+",'"+hp+"',sysdate)";
		System.out.println(sql);

		//1.db연결
		Connection conn=null;
		//2.statement
		Statement stmt=null; //sql문 객체 전송에 필요한 api

		conn=db.getoracle();

		try {
			stmt=conn.createStatement();

			//3.sql문 실행
			stmt.execute(sql);
			System.out.println("**데이터 추가됨**");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt,conn);
		}
	}

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		QuizStuinfo qs = new QuizStuinfo(); 
		qs.insert();
		//if()

	}

}
