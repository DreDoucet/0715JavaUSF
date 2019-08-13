package com.sequenceaccountdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FindSequenceAccountDAO {
	
	private static String url = "jdbc:oracle:thin:@usfandre.criuvgq4iww6.us-east-2.rds.amazonaws.com:1521:orcl";
	private static String username = "dre909";
	private static String password = "p4ssw0rd";

	public long FindById() {
		final String SQLP = "SELECT * FROM AccountParameters WHERE idAccountP = 1";
		long number = 0;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement statement = conn.prepareStatement(SQLP);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				number = rs.getLong(2);
				return number;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
