package com.employeeScreen;

import java.util.ListIterator;
import java.util.Scanner;

import com.drivers.DataDBDriver;
import com.mainmenu.MainScreen;
import com.uncertainty.Account;

public class ApproveDeny {

	public void ApproveDenyInterface() {
		DataDBDriver<Account> v = new DataDBDriver();
		for (Account a : MainScreen.account) {
			if (a.getStatus() == 'p') {
				System.out.println(a.getAccountNumber() + " " + a.getId());
			}
		}
		
		System.out.println("Choose the account");
		Scanner idAccount = new Scanner(System.in);
		String gh = idAccount.nextLine();

			int op;
			char statusA = ' ';
			do {
				System.out.println("Press 1 to approve or press 2 to deny.");
				Scanner in = new Scanner(System.in);
				op = in.nextInt();
				switch (op) {
				case 1:
					// Approve
					statusA = 'a';
					break;

				case 2:
					// Deny
					statusA = 'd';
					break;

				//default:
					//break;
				}
			} while (op != 1 && op != 2);
			ListIterator<Account> statusB = MainScreen.account.listIterator();
			Account acc;
			while(statusB.hasNext()) {
				acc = statusB.next();
				if(acc.getAccountNumber().equals(gh)) {
					acc.setStatus(statusA);
					statusB.set(acc);
					break;
				}
			}
		
			
		for(Account a : MainScreen.account ) System.out.println(a);
		v.updateFile(MainScreen.account, "./account.txt");
	}
}