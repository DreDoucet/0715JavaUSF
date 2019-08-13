package com.adminScreen;

import java.util.Scanner;

import com.dao.AdminCreate;
import com.daoimplement.AdminDAOImplementation;
import com.mainmenu.MainScreen;
import com.uncertainty.Admin;


public class ScreenOfAdmin {
	public void menuBridge() {
		Admin admin = new Admin();
		AdminDAOImplementation dongle = new AdminDAOImplementation();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your username.");
		String adminUsername = in.nextLine();
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter your password.");
		String adminPassword = in2.nextLine();
		Scanner in3 = new Scanner(System.in);
		System.out.println("Enter your name.");
		String adminName = in3.nextLine();
		
		admin.setAdminUsername(adminUsername);
		admin.setAdminPassword(adminPassword);
		admin.setName(adminName);
		
		dongle.CreateRecord(admin);
		
		
	}
}
