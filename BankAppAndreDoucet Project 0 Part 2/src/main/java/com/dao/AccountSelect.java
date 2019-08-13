package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.uncertainty.Account;

public class AccountSelect {
	private static String url = "jdbc:oracle:thin:@usfandre.criuvgq4iww6.us-east-2.rds.amazonaws.com:1521:orcl";
	private static String username = "dre909";
	private static String password = "p4ssw0rd";

	public List<Account> SelectAccountDB(String accStatus) {//boolean
		final String SQLP = "SELECT * FROM Account WHERE status = ?";
		List<Account> lAcc = new ArrayList<>();
		Account acco;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement statement = conn.prepareStatement(SQLP);
			statement.setString(1, accStatus);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {//statement.executeUpdate;
				acco = new Account();
				acco.setAccount_Numero(rs.getString(1));
				acco.setDate_loaded(rs.getDate(2));
				acco.setAmount(rs.getDouble(3));
				acco.setStatus(rs.getString(4));
				acco.setUser_name(rs.getString(5));
				lAcc.add(acco);

			}
			return lAcc;
		} catch (SQLException e) {
			//e.printStackTrace();
		}
		return null;

	}
}
