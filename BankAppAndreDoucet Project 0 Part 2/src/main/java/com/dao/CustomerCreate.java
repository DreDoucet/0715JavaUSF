package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.drivers.DataDBDriver;
import com.mainmenu.MainScreen;
import com.uncertainty.Customer;

public class CustomerCreate {
	private static String url = "jdbc:oracle:thin:@usfandre.criuvgq4iww6.us-east-2.rds.amazonaws.com:1521:orcl";
	private static String username = "dre909";
	private static String password = "p4ssw0rd";

	public boolean addtoDB(Customer customer) {
		final String SQLP = "insert into Customer VALUES(?,?,?,?,?)"; 
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement statement = conn.prepareStatement(SQLP);
			statement.setString(1, customer.getUsername());
			statement.setString(2, customer.getName());
			statement.setString(3, customer.getAddress());
			statement.setString(4, customer.getTelephonenumber());
			statement.setString(5, customer.getPassword());
			return statement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
