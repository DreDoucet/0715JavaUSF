package com.uncertainty;

import java.sql.Date;
import java.time.LocalDate;

public class Account {

	private String Account_Numero;
	private Date date_loaded;
	private double amount;
	private String status;
	private String user_name;
	
	public String getAccount_Numero() {
		return Account_Numero;
	}
	public void setAccount_Numero(String account_Numero) {
		Account_Numero = account_Numero;
	}
	public Date getDate_loaded() {
		return date_loaded;
	}
	public void setDate_loaded(Date date_loaded) {
		this.date_loaded = date_loaded;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Override
	public String toString() {
		return "Account [Account_Numero=" + Account_Numero + ", date_loaded=" + date_loaded + ", amount=" + amount
				+ ", status=" + status + ", user_name=" + user_name + "]";
	}
	
	
}
