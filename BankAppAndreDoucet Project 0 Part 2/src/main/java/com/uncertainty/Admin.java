package com.uncertainty;


public class Admin {
	
	private String adminUsername;
	private String adminPassword;
	private String name;
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Admin [adminUsername=" + adminUsername + ", adminPassword=" + adminPassword + ", name=" + name + "]";
	}
	
	
	

}
