package com.uncertainty;


public class Employee{

	private String employeeLogin;
	private String employeePassword;
	private String employeeName;
	public String getEmployeeLogin() {
		return employeeLogin;
	}
	public void setEmployeeLogin(String employeeLogin) {
		this.employeeLogin = employeeLogin;
	}
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeLogin=" + employeeLogin + ", employeePassword=" + employeePassword + ", employeeName="
				+ employeeName + "]";
	}

}
