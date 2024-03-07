package intro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import mysql.db.DbConnect;




public class introDao {
	
DbConnect db=new DbConnect();
	
	public void insertIntro(introDto dto)
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="insert into intro values(null,?,?,?,?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
		
			//?바인딩

			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getBirthday());
			pstmt.setString(3, dto.getHobby());
			pstmt.setString(4, dto.getHometown());
			pstmt.setString(5, dto.getMemo());
			pstmt.setString(6, dto.getAge());
			
			//업데이트
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	
	public List<introDto> getAllDatas()
	{
		List<introDto> list=new Vector<introDto>();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from info order by num";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			//여러개의 데이타 얻을땐 while
			while(rs.next())
			{
				introDto dto=new introDto();
				
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setBirthday(rs.getString("birthday"));
				dto.setHobby(rs.getString("hobby"));
				dto.setHometown(rs.getString("hometown"));
				dto.setMemo(rs.getString("memo"));
				dto.setAge(rs.getString("age"));
				
				//벡터에 추가
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return list;
	}
	
}
