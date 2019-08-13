package com.mainmenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.customerScreen.ScreenOfCustomer;
import com.daoimplement.CustomerDAOImplementation;
import com.drivers.DataDBDriver;
import com.uncertainty.Customer;
import com.employeeScreen.ScreenOfEmployee;
import com.uncertainty.Employee;
import com.adminScreen.AdminPostLoginMenu;
import com.adminScreen.ScreenOfAdmin;
import com.uncertainty.Admin;
import com.accountScreen.ScreenOfAccount;
import com.uncertainty.ATMInterface;
import com.uncertainty.Account;
import com.customerScreen.Login;
import com.employeeScreen.EmployeePostLoginMenu;
import com.employeeScreen.ApproveDeny;

public class MainScreen {
	public static List<Customer> customer = new ArrayList<>();
	public static List<Employee> employee = new ArrayList<>();
	public static List<Admin> admin = new ArrayList<>();
	public static List<Account> account = new ArrayList<>();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		Scanner menuChoice = new Scanner(System.in);
		int choice;

		do { 
			System.out.println("1. Customer Login");
			System.out.println("2. Employee Login");
			System.out.println("3. Admin Login");
			System.out.println("4. Exit");
			System.out.println("Please select an option.");
			choice = menuChoice.nextInt();
			
			switch (choice) {
			case 1:
				menu1();
				break;
			case 2:
				menu2();
				break;
			case 3:
				menu3();
				break;

			default:
				if (choice != 4)
					System.out.println("Not a valid option.");
					
				break;
			}
		} while (choice != 4);
	}

	static void menu1() {
		@SuppressWarnings("resource")
		Scanner userChoice = new Scanner(System.in);
		int op;
		do {
			System.out.println("1. Login");
			System.out.println("2. Create Login");
			System.out.println("3. Apply for Account");
			System.out.println("4. Exit");
			System.out.println("Please select an option.");
			op = userChoice.nextInt();

			switch (op) {
			case 1:
				Login logn = new Login();
				String abc = logn.custLogin();
				if (!abc.equals("")) {
					ATMInterface atm = new ATMInterface();
					atm.ATMAccess(abc);
				}
				break;
			case 2:
				ScreenOfCustomer custScreen = new ScreenOfCustomer();
				custScreen.menuBridge();

				break;

			case 3:
				ScreenOfAccount acctScreen = new ScreenOfAccount();
				acctScreen.menuBridge();
				break;

			default:
				if (op != 4)
					System.out.println("Not a valid option.");
				break;
			}
		} while (op != 4);
	}

	static void menu2() {
		@SuppressWarnings("resource")
		Scanner userChoice = new Scanner(System.in);
		int op;
		do {
			System.out.println("1. Employee Login");
			System.out.println("2. Create Employee Login");
			System.out.println("3. Exit");
			System.out.println("Please select an option.");
			op = userChoice.nextInt();

			switch (op) {
			case 1:
				Login logn = new Login();
				if (logn.emplyLogin()) {
					EmployeePostLoginMenu emp = new EmployeePostLoginMenu();
					emp.EmplyMenuTime();
					
				}
				break;

			case 2:
				ScreenOfEmployee employeeScreen = new ScreenOfEmployee();
				employeeScreen.menuBridge();

				break;

			default:
				if (op != 3)
					System.out.println("Not a valid option.");
				break;
			}
		} while (op != 3);
	}

	static void menu3() {
		@SuppressWarnings("resource")
		Scanner userChoice = new Scanner(System.in);
		int op;
		do {
			System.out.println("1. Admin Login");
			System.out.println("2. Create Admin Login");
			System.out.println("3. Exit");
			System.out.println("Please select an option.");
			op = userChoice.nextInt();

			switch (op) {
			case 1:
				Login logn = new Login();
				if (logn.adminLogin()) {
					AdminPostLoginMenu adm = new AdminPostLoginMenu();
					adm.AdminMenuTime(null);
					
				}

				break;
			case 2:
				ScreenOfAdmin ofAdmin = new ScreenOfAdmin();
				ofAdmin.menuBridge();

				break;

			default:
				if (op != 3)
					System.out.println("Not a valid option.");
				break;
			}
		} while (op != 3);
	}
}
