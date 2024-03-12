package mouse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import mysql.db.DbConnect;

public class MouseDao  {
	
	DbConnect db=new DbConnect();
	
	public void insertMouse(MouseDto dto ) throws SQLException 
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql="insert into mouse (mouse,price,color,gender,writer) values (?,?,?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMouse());
			pstmt.setString(2, dto.getPrice());
			pstmt.setString(3, dto.getColor());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getWriter());
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}
	
	//전체출력
		public List<MouseDto> getAllDatas()
		{
			List<MouseDto> list=new ArrayList<MouseDto>();
			
			Connection conn=db.getConnection();
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			
			String sql="select * from mouse order by num desc";
			
			try {
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				
				while(rs.next())
				{
					MouseDto dto=new MouseDto();
					
					
					dto.setWriter(rs.getString("writer"));
					dto.setColor(rs.getString("color"));
					dto.setGender(rs.getString("gender"));
					dto.setWriter(rs.getString("writer"));
					dto.setMouse(rs.getString("kind") );
				
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
