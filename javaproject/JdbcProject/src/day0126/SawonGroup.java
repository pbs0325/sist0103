package day0126;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracledb.DbConnect;

public class SawonGroup {

	private static final PreparedStatement stmt = null;
	private static final Connection conn = null;
	private static final ResultSet rs = null;
	DbConnect db=new DbConnect();

	public void connectSawonGroup()
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		//sql전달할 객체
		String sql="select gender,count(*) count, to_char(round(avg(pay),0),'999,999,999') avgpay,"
				+ "to_char(max(pay),'999,999,999') maxpay, to_char(min(pay),'999,999,999') minpay "
				+ "from sawon group by gender";

		conn=db.getoracle();
		System.out.println("오라클 계정연결 성공!!!");
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("\t***회사 남녀별 급여통계***");
			System.out.println();
			System.out.println("성별\t인원수\t평균급여\t최고급여\t최저급여");
			System.out.println("-----------------------------------------------");

			while(rs.next())
			{
				String gender=rs.getString("gender");
				int count=rs.getInt("count");
				String avgpay=rs.getString("avgpay");
				String maxpay=rs.getString("maxpay");
				String minpay=rs.getString("minpay");

				System.out.println(gender+"\t"+count+"\t"+avgpay+"\t"+maxpay+"\t"+minpay);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	finally {

		db.dbClose(rs, stmt, conn);
	}
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	SawonGroup sawonGroup = new SawonGroup(); // SawonGroup 클래스의 인스턴스 생성
    sawonGroup.connectSawonGroup(); // connectSawonGroup() 메서드 호출
}

}
