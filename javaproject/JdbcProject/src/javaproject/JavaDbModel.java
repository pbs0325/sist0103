package javaproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import oracledb.DbConnect;

public class JavaDbModel {
	
	DbConnect db = new DbConnect();
	
	//사원추가
	public void insertSawon(JavaDto dto) {
		Connection conn=db.getoracle();
		PreparedStatement pstmt=null;
		
		String sql="insert into employee values(seq_emp.nextval,?,?,?,?,?,?,?,?,?)";

		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhoto());
			pstmt.setString(3, dto.getGender());
			pstmt.setString(4, dto.getDept());
			pstmt.setString(5, dto.getPosition());
			pstmt.setString(6, dto.getAddr());
			pstmt.setInt(7, dto.getPay());
			pstmt.setString(8, dto.getEmail());
			pstmt.setString(9, dto.getIpsaday());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn); 
		}
	}

	//사원목록
	public Vector<JavaDto> getAllSawon() 
	{
		Vector<JavaDto> list=new Vector<JavaDto>();
		
		Connection conn = db.getoracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql="select * from employee order by num";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				JavaDto dto=new JavaDto();
				
				dto.setName(rs.getString("num"));
				dto.setPhoto(rs.getString("photo"));
				dto.setGender(rs.getString("gender"));
				dto.setDept(rs.getString("dept"));
				dto.setPosition(rs.getString("position"));
				dto.setAddr(rs.getString("addr"));
				dto.setPay(rs.getInt("Pay"));
				dto.setEmail(rs.getString("email"));
				dto.setIpsaday(rs.getString("ipsaday"));
				
				list.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return list;
	}
	
	//사원삭제
	public void deleteSawon(String num) {
		Connection conn=db.getoracle();
		PreparedStatement pstmt = null;
		
		String sql="delete from employee where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, num);
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}

	}
	
	//사원수정
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
