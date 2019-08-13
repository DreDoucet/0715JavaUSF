package com.sequenceaccountdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateSequenceAccountDAO {
	
	private static String url = "jdbc:oracle:thin:@usfandre.criuvgq4iww6.us-east-2.rds.amazonaws.com:1521:orcl";
	private static String username = "dre909";
	private static String password = "p4ssw0rd";

	public boolean updateRecord() {
		final String SQLP = "UPDATE AccountParameters SET idSequence = idSequence + 1 WHERE idAccountP = 1";
		long number = 0;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement statement = conn.prepareStatement(SQLP);
			return statement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
