package com.adminScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.drivers.DataDBDriver;
import com.mainmenu.MainScreen;
import com.uncertainty.Account;
import com.dao.AccountSelect;
import com.dao.AccountUpdate;

public class AdminApproveDeny {

	public static AccountSelect accSel = new AccountSelect();

	public void ApproveDenyInterface() {
		List<Account> ls = new ArrayList<>();
		AccountUpdate accUp = new AccountUpdate();
		ls = accSel.SelectAccountDB("p");
		if (ls != null) {
			for (Account a : ls) {
				if (a.getStatus().equals("p")) {
					System.out.println(a.getAccount_Numero() + " " + a.getAmount());
				}
			}
		}

		System.out.println("Choose the account");
		Scanner idAccount = new Scanner(System.in);
		String gh = idAccount.nextLine();
		AdminPostLoginMenu dah = new AdminPostLoginMenu();

		int op;
		String statusA = " ";
		do {
			System.out.println("Press 1 to approve.");
			System.out.println("Press 2 to deny.");
			System.out.println("Press 3 to cancel.");
			Scanner in = new Scanner(System.in);
			op = in.nextInt();
			switch (op) {
			case 1:
				// Approve
				statusA = "a";
				dah.AdminMenuTime(null);
				break;

			case 2:
				// Deny
				statusA = "d";
				dah.AdminMenuTime(null);
				break;
				
			case 3:
				// Cancel
				statusA = "c";
				dah.AdminMenuTime(null);
				break;

			default:
				break;
			}
		} while (op != 1 && op != 2 && op != 3 && op !=4);
		accUp.UpdateAccountDB(statusA, gh);
		
	}

}
