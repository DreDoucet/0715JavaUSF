package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.uncertainty.Account;

public class AccountUpdate {
	private static String url = "jdbc:oracle:thin:@usfandre.criuvgq4iww6.us-east-2.rds.amazonaws.com:1521:orcl";
	private static String username = "dre909";
	private static String password = "p4ssw0rd";

	public boolean UpdateAccountDB(String accStatus, String accUpdate) {
		final String SQLP = "UPDATE Account SET status = ? WHERE Account_Numero = ?";
		List<Account> lAcc = new ArrayList<>();
		Account acco;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement statement = conn.prepareStatement(SQLP);
			statement.setString(1, accStatus);
			statement.setString(2, accUpdate);
			
			
			return statement.executeUpdate() > 0;
		} catch (SQLException e) {
			//e.printStackTrace();
		}
		return false;

	}
}
