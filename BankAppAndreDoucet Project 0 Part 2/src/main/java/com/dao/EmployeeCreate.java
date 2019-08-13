package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.drivers.DataDBDriver;
import com.mainmenu.MainScreen;
import com.uncertainty.Employee;

public class EmployeeCreate {
	
	private static String url = "jdbc:oracle:thin:@usfandre.criuvgq4iww6.us-east-2.rds.amazonaws.com:1521:orcl";
	private static String username = "dre909";
	private static String password = "p4ssw0rd";
	
public boolean addtoDB(Employee employee) {
	final String SQLP = "insert into Employee VALUES(?,?,?)"; 
	try (Connection conn = DriverManager.getConnection(url, username, password)) {
		PreparedStatement statement = conn.prepareStatement(SQLP);
		statement.setString(1, employee.getEmployeeLogin());
		statement.setString(2, employee.getEmployeePassword());
		statement.setString(3, employee.getEmployeeName());
		return statement.executeUpdate() > 0;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
}
	
}

