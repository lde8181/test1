package com.dj.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dj.dto.PersonDTO;

public class UserInfoDAO {
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public int setUserInfo(PersonDTO person){
		String sql = "INSERT INTO PERSON(USERID, PASSWORD,NAME, GENDER, AGE, JOB, ADDRESS) VALUES(?,?,?,?,?,?,?)";
		int i = 0;
		try {
			pstmt = JDBCConnection.getConnection().prepareStatement(sql);
			pstmt.setString(1, person.getUserId());
			pstmt.setString(2, person.getPassword());
			pstmt.setString(3, person.getName());
			pstmt.setString(4, person.getGender());
			pstmt.setInt(5, person.getAge());
			pstmt.setString(6, person.getJob());
			pstmt.setString(7, person.getAddress());
			
			i = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return i;
	}
	
	
}

