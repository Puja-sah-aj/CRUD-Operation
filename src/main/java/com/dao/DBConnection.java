package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection getConn() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbconnect4","root","Puja2002");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return conn;
		
		
	}

}
