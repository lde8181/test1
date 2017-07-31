package com.dj.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dj.dao.JDBCConnection;
import com.dj.dto.BBSDTO;

public class BBSInfoDAO {
	PreparedStatement pstmt;
	ResultSet rs;
	
	public List<BBSDTO> getBBSList(){
		List<BBSDTO> list = new ArrayList<BBSDTO>();
		String sql = "SELECT ID, TITLE, OWNER, DATE, CONTENT FROM BBS";
		
		try {
			pstmt = JDBCConnection.getConnection().prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				BBSDTO bbs = new BBSDTO();
				bbs.setId(rs.getInt("id"));
				bbs.setTitle(rs.getString("title"));
				bbs.setOwner(rs.getString("owner"));
				bbs.setDatetime(rs.getDate("date"));
				bbs.setContent(rs.getString("content"));
				list.add(bbs);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}
	
}




