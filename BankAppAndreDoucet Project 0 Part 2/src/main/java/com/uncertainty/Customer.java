package com.uncertainty;


public class Customer{

	private String name;
	private String address;
	private String telephonenumber;
	private String username;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephonenumber() {
		return telephonenumber;
	}
	public void setTelephonenumber(String telephonenumber) {
		this.telephonenumber = telephonenumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", telephonenumber=" + telephonenumber
				+ ", username=" + username + ", password=" + password + "]";
	}
	
		
	 

}
