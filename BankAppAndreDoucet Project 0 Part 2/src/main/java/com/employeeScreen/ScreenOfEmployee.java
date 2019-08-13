package com.employeeScreen;

import java.util.Scanner;

import com.dao.EmployeeCreate;
import com.daoimplement.EmployeeDAOImplement;
import com.mainmenu.MainScreen;
import com.uncertainty.Employee;

public class ScreenOfEmployee {
	public void menuBridge() {
		Employee employee = new Employee();
		EmployeeDAOImplement samophlange = new EmployeeDAOImplement();
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter your user name.");
		String employeeLogin = in2.nextLine();
		Scanner in3 = new Scanner(System.in);
		System.out.println("Enter your password.");
		String employeePassword = in3.nextLine();
		Scanner in4 = new Scanner(System.in);
		System.out.println("Enter your name.");
		String employeeName = in4.nextLine();
		
		
		
		employee.setEmployeeLogin(employeeLogin);
		employee.setEmployeePassword(employeePassword);
		employee.setEmployeeName(employeeName);
		
		
		samophlange.CreateRecord(employee);
	}
}
