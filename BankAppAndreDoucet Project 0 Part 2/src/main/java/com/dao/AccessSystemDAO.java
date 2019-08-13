package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.uncertainty.Admin;
import com.uncertainty.Customer;
import com.uncertainty.Employee;

public class AccessSystemDAO {
	private static String url = "jdbc:oracle:thin:@usfandre.criuvgq4iww6.us-east-2.rds.amazonaws.com:1521:orcl";
	private static String username = "dre909";
	private static String password = "p4ssw0rd";
	
	public Customer custa(Customer ca) { 
		final String SQLP = "SELECT * FROM Customer WHERE user_name = ? AND password = ?";
		Customer customer = null;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement statement = conn.prepareStatement(SQLP);
			statement.setString(1, ca.getUsername());
			statement.setString(2, ca.getPassword());
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				customer = new Customer();
				customer.setUsername(rs.getString(1));
				customer.setName(rs.getString(2));
				customer.setAddress(rs.getString(3));
				customer.setTelephonenumber(rs.getString(4));
				customer.setPassword(rs.getString(5));
			}
			return customer;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Employee emplo(Employee em) { 
		final String SQLP = "SELECT * FROM Employee WHERE employeeLogin = ? AND employeePassword = ?";
		Employee employee = null;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement statement = conn.prepareStatement(SQLP);
			statement.setString(1, em.getEmployeeLogin());
			statement.setString(2, em.getEmployeePassword());
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				employee = new Employee();
				employee.setEmployeeLogin(rs.getString(1));
				employee.setEmployeePassword(rs.getString(2));
				employee.setEmployeeName(rs.getString(3));
				}
			return employee;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Admin admio(Admin ad) { 
		final String SQLP = "SELECT * FROM Admin WHERE adminUsername = ? AND adminPassword = ?";
		Admin admin = null;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement statement = conn.prepareStatement(SQLP);
			statement.setString(1, ad.getAdminUsername());
			statement.setString(2, ad.getAdminPassword());
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				admin = new Admin();
				admin.setAdminUsername(rs.getString(1));
				admin.setAdminPassword(rs.getString(2));
				admin.setName(rs.getString(3));
				}
			return admin;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
