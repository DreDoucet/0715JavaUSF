package com.uncertainty;

import java.util.Scanner;

import com.customerScreen.BankingInterfaceDeposit;
import com.customerScreen.BankingInterfaceWithdraw;
import com.employeeScreen.CheckBalance;
import com.customerScreen.Login;

public class ATMInterface {

	public void ATMAccess(String userName) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int custChoice;
		boolean quit = false;
		double balance = 0.00;
		
		do {
			System.out.println("1. Deposit money");
			System.out.println("2. Withdraw money");
			System.out.println("3. Check balance");
			System.out.println("Your choice, 0 to quit: ");
			custChoice = in.nextInt();
			
			switch (custChoice) {
			case 1:
				BankingInterfaceDeposit dep = new BankingInterfaceDeposit();
				dep.MoneyTime(userName);
				
				break;
			case 2:
				BankingInterfaceWithdraw with = new BankingInterfaceWithdraw();
				with.MoneyTimeW(userName);
				// withdraw money, and insure the transaction is possible before execution
//				System.out.println("Amount to withdraw: ");
//				amnt = in.nextDouble();
//				if (amnt <= 0 || amnt > balance)
//					System.out.println("Withdrawal can't be completed.");
//				else {
//				balance -= amnt;
//				System.out.println("$" + amnt + " has been withdrawn.");
				}
				break;
//			case 3:
//				
//				CheckBalance ck = new CheckBalance();
//				ck.chequeBal();
////				// check balance
////				System.out.println("Your balance: $" + balance);
//				break;
//			case 0:
//				quit = true;
//				break;
			//default:
//					System.out.println("Wrong choice.");
//					break;
			
		} while (!quit);
		System.out.println("Bye!");
	}

}
