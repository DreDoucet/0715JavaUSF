package com.adminScreen;

import java.util.Scanner;

import com.mainmenu.MainScreen;
import com.uncertainty.Account;
import com.uncertainty.Customer;
import com.customerScreen.BankingInterfaceDeposit;
import com.customerScreen.BankingInterfaceWithdraw;
import com.employeeScreen.ApproveDeny;
import com.employeeScreen.CheckBalance;
import com.employeeScreen.CustInfoLookup;

public class AdminPostLoginMenu {

	public void AdminMenuTime() {Scanner adminChoice = new Scanner(System.in);
	int op; 
	
	{
	do {
		System.out.println("1. Approve Accounts");
		System.out.println("2. Check Account balances");
		System.out.println("3. Lookup customer info");
		System.out.println("4. Withdraw");
		System.out.println("5. Deposit");
		System.out.println("6. Transfer Funds");
		System.out.println("0. Exit");
		System.out.println("Please select an option.");
		op = adminChoice.nextInt();
		
		

		switch (op) {
		case 1:
			AdminApproveDeny ad = new AdminApproveDeny();
			ad.AdminApproveDenyInterface();
			break;
		case 2:
			CheckBalance ck = new CheckBalance();
			ck.chequeBal();
			
			break;
			
		case 3:
			CustInfoLookup lk = new CustInfoLookup();
			lk.custInfoLookup();
			
			break;
		case 4:
			BankingInterfaceWithdraw with = new BankingInterfaceWithdraw();
			with.MoneyTimeW();
			break;
			
		case 5:
			BankingInterfaceDeposit dep = new BankingInterfaceDeposit();
			dep.MoneyTime();
			break;
		case 6:
			break;

		default:
			if (op != 7)
				System.out.println("Not a valid option.");
			break;
		}
	} while (op != 7);
}
}

}
