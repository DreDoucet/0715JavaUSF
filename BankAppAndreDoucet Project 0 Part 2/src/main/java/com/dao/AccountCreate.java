package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uncertainty.Account;

public class AccountCreate {
	private static String url = "jdbc:oracle:thin:@usfandre.criuvgq4iww6.us-east-2.rds.amazonaws.com:1521:orcl";
	private static String username = "dre909";
	private static String password = "p4ssw0rd";
	
	public boolean addtoDB(Account account) {
		final String SQLP = "insert into Account VALUES(?,?,?,?,?)"; 
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement statement = conn.prepareStatement(SQLP);
			statement.setString(1, account.getAccount_Numero());
			statement.setDate(2, account.getDate_loaded());
			statement.setDouble(3, account.getAmount());
			statement.setString(4, account.getStatus());
			statement.setString(5, account.getUser_name());
			return statement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}

}
