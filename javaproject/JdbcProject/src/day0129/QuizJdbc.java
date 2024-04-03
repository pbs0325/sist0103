package day0129;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracledb.DbConnect;

public class QuizJdbc {

	Scanner sc=new Scanner(System.in);
	DbConnect db=new DbConnect();

	private void insertMember() {

		System.out.println("사원명:");
		String name = sc.nextLine();
		System.out.println("부서:");
		String buseo = sc.nextLine();
		System.out.println("직급:");
		String level = sc.nextLine();
		System.out.println("성별:");
		String gender = sc.nextLine();
		System.out.println("월급여:");
		int pay = sc.nextInt();
		System.out.println("보너스:");
		int bonus = sc.nextInt();

		Connection conn=db.getoracle();
		PreparedStatement pstmt=null;

		String sql="insert into sawonmember (s_no,name,buseo,position,gender,pay,bonus,ipsaday) values (seq_smem.nextval, ?,?,?,?,?,?,sysdate)";

		try {
			pstmt=conn.prepareStatement(sql);

			//바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, buseo);
			pstmt.setString(3, level);
			pstmt.setString(4, gender);
			pstmt.setInt(5, pay);
			pstmt.setInt(6, bonus);

			//?갯수만큼 모두 바인딩후 실행
			pstmt.execute();
			System.out.println("추가되었습니다");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
//////////////////////////////////////////////////////////////
	private void writeMember() {
		Connection conn=db.getoracle();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from sawonmember order by s_no";
		System.out.println("\t\t사원 정보");
		System.out.println("사원번호\t사원명\t부서\t직책\t성별\t월급\t보너스\t입사날짜");
		System.out.println("-------------------------------------------------------------------------------");
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt("s_no")+"\t"
						+rs.getString("name")+"\t"
						+rs.getString("buseo")+"\t"
						+rs.getString("position")+"\t"
						+rs.getString("gender")+"\t"
						+rs.getInt("pay")+"\t"
						+rs.getInt("bonus")+"\t"
				+rs.getString("ipsaday")+"\t");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		

	}
	
//////////////////////////////////////////////////////////////
	private void deleteMember() {
		Connection conn=db.getoracle();
		PreparedStatement pstmt=null;
		
		System.out.println("삭제할 시퀀스는?");
		int num=Integer.parseInt(sc.nextLine());
		String sql="delete from sawonmember where s_no=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			int n=pstmt.executeUpdate();
			
			if(n==1)
				System.out.println("삭제성공");
			else
				System.out.println("삭제실패");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}

	}
/////////////////////////////////////////////////////
	private void updateMember() {
		Connection conn=db.getoracle();
		PreparedStatement pstmt=null;
		
		System.out.println("수정할 사원번호는?");
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("수정할 사원명은?");
		String name=sc.nextLine();
		System.out.println("수정할 부서명은?");
		String buseo=sc.nextLine();
		System.out.println("수정할 직책은?");
		String position=sc.nextLine();
		System.out.println("수정할 성별은?");
		String gender=sc.nextLine();
		System.out.println("수정할 월급은?");
		int pay=Integer.parseInt(sc.nextLine());
		System.out.println("수정할 보너스는?");
		int bonus=Integer.parseInt(sc.nextLine());
		
		String sql="update sawonmember set name=?,buseo=?,position=?,gender=?,pay=?,bonus=? where s_no=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, buseo);
			pstmt.setString(3, position);
			pstmt.setString(4, gender);
			pstmt.setInt(5, pay);
			pstmt.setInt(6, bonus);
			pstmt.setInt(7, num);
			
			int n=pstmt.executeUpdate();
			
			if(n==1)
				System.out.println("수정되었습니다");
			else
				System.out.println(num+"번 사원이 존재하지 않습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}

	}
/////////////////////////////////////////////////////
	private void searchSawon() {
		
		System.out.println("검색할 사원명을 입력하세요(일부)");
		String name = sc.nextLine();
		
		String sql="select s_no, name, buseo, position, gender, pay, bonus, ipsaday from sawonmember where name like ?";
		
		System.out.println("사원번호\t사원명\t부서\t직책\t성별\t월급\t보너스\t입사일");
		
		Connection conn=db.getoracle();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, "%"+name+"%");
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt("s_no")+"\t"
						+rs.getString("name")+"\t"
						+rs.getString("buseo")+"\t"
						+rs.getString("position")+"\t"
						+rs.getString("gender")+"\t"
						+rs.getInt("pay")+"\t"
						+rs.getInt("bonus")+"\t"
						+rs.getDate("ipsaday"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}

	}
	
	private void process() {
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.사원정보입력    2.전체사원출력    3.사원삭제    4.사원수정   5.이름검색    9.시스템종료");
			System.out.println("--------------------------번호 입력하세요-------------------------------------");
			int n=Integer.parseInt(sc.nextLine());

			if(n==1)
				this.insertMember();
			if(n==2)
				this.writeMember();
			if(n==3)
				this.deleteMember();
			if(n==4)
				this.updateMember();
			if(n==5)
				this.searchSawon();
			else if(n==9)
			{
				System.out.println("시스템 종료");
				break;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizJdbc qj=new QuizJdbc();
		qj.process();
	}

}
