package com.dj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	private static Connection conn = null;
	
	public static Connection getConnection(){
		if(conn==null){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/account",
						"root", "1234");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}



