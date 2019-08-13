package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.uncertainty.Account;
import com.uncertainty.Customer;

public class CustomerSelect {
	private static String url = "jdbc:oracle:thin:@usfandre.criuvgq4iww6.us-east-2.rds.amazonaws.com:1521:orcl";
	private static String username = "dre909";
	private static String password = "p4ssw0rd";
	
	public List<Customer> SelectCustomerDB() {//boolean
		final String SQLP = "SELECT * FROM Customer";
		List<Customer> lCus = new ArrayList<>();
		Customer cust;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement statement = conn.prepareStatement(SQLP);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {//statement.executeUpdate;
				Customer custo = new Customer();
				custo.setUsername(rs.getString(1));
				custo.setName(rs.getString(2));
				custo.setAddress(rs.getString(3));
				custo.setTelephonenumber(rs.getString(4));
				custo.setPassword(rs.getString(5));
				lCus.add(custo);
//				acco.setAccount_Numero(rs.getString(1));
//				acco.setDate_loaded(rs.getDate(2));
//				acco.setAmount(rs.getDouble(3));
//				acco.setStatus(rs.getString(4));
//				acco.setUser_name(rs.getString(5));
//				lAcc.add(acco);

			}
			return lCus;
		} catch (SQLException e) {
			//e.printStackTrace();
		}
		return null;

	}
}
