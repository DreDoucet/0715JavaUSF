package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.drivers.DataDBDriver;
import com.mainmenu.MainScreen;
import com.uncertainty.Admin;

public class AdminCreate {
	
	private static String url = "jdbc:oracle:thin:@usfandre.criuvgq4iww6.us-east-2.rds.amazonaws.com:1521:orcl";
	private static String username = "dre909";
	private static String password = "p4ssw0rd";
	
	
	public boolean addtoDB(Admin admin) {
		final String SQLP = "insert into Admin VALUES(?,?,?)"; 
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement statement = conn.prepareStatement(SQLP);
			statement.setString(1, admin.getAdminUsername());
			statement.setString(2, admin.getAdminPassword() );
			statement.setString(3, admin.getName());
			
			return statement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
