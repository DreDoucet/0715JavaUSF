package com.customerScreen;

import java.util.Scanner;

import com.dao.AccessSystemDAO;
import com.daoimplement.AdminDAOImplementation;
import com.daoimplement.CustomerDAOImplementation;
import com.daoimplement.EmployeeDAOImplement;
import com.mainmenu.MainScreen;
import com.uncertainty.Admin;
import com.uncertainty.Customer;
import com.uncertainty.Employee;

public class Login {
	public String custLogin() {
		Scanner scanner = new Scanner(System.in);
		CustomerDAOImplementation asdcust = new CustomerDAOImplementation();
		Customer cus = new Customer();
		

		System.out.println("Please enter your username.");
		String inputName = scanner.nextLine();

		System.out.println("Please enter your password.");
		String inputPass = scanner.nextLine();
		
		cus.setUsername(inputName);
		cus.setPassword(inputPass);
		cus = asdcust.FindByIdRecord(cus);
		if(cus != null)
			return inputName;
		return "";
	}

	public boolean emplyLogin() {
		EmployeeDAOImplement emplo = new EmployeeDAOImplement();
		Employee emp = new Employee();
		
		System.out.println("Please enter your username.");
		Scanner logName = new Scanner(System.in);
		String inputName = logName.nextLine();
		System.out.println("Please enter your password.");
		Scanner logPass = new Scanner(System.in);
		String inputPass = logPass.nextLine();
		
		emp.setEmployeeLogin(inputName);
		
		emp.setEmployeePassword(inputPass);
		
		emp = emplo.FindByIdRecord(emp);
		
		if(emp != null)
			return true;
		return false;
	}

	public boolean adminLogin() {
		AdminDAOImplementation admidao = new AdminDAOImplementation();
		Admin admi = new Admin();
		
		System.out.println("Please enter your username.");
		Scanner logName = new Scanner(System.in);
		String inputName = logName.nextLine();
		System.out.println("Please enter your password.");
		Scanner logPass = new Scanner(System.in);
		String inputPass = logPass.nextLine();
		
		admi.setAdminUsername(inputName);
		admi.setAdminPassword(inputPass);
		admi = admidao.FindByIdRecord(admi);
		
		if(admi != null)
			return true;
		return false;
	}
}
