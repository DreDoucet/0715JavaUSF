package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.uncertainty.Account;

public class UpdateAccountDAOWithdraw {
	private static String url = "jdbc:oracle:thin:@usfandre.criuvgq4iww6.us-east-2.rds.amazonaws.com:1521:orcl";
	private static String username = "dre909";
	private static String password = "p4ssw0rd";
	
	public boolean updateAccountDeposit(double amount, String userName, String accountNumero) {
		final String SQLP = "UPDATE Account SET amount = amount - ? WHERE status = 'a' and user_name = ? and "
				+ "account_numero = ?";
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement statement = conn.prepareStatement(SQLP);
			statement.setDouble(1, amount);
			statement.setString(2, userName);
			statement.setString(3, accountNumero);

			
			return statement.executeUpdate() > 0;
		} catch (SQLException e) {
			//e.printStackTrace();
		}
		return false;
	}
}
