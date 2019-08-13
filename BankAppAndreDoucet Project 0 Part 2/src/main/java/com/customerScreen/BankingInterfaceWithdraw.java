package com.customerScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.dao.AccountDAOCustomer;
import com.dao.UpdateAccountDAODeposit;
import com.dao.UpdateAccountDAOWithdraw;
import com.drivers.DataDBDriver;
import com.mainmenu.MainScreen;
import com.uncertainty.Account;
import com.uncertainty.Customer;


public class BankingInterfaceWithdraw {
	public void MoneyTimeW(String userName) {
		AccountDAOCustomer accDao = new AccountDAOCustomer();
		UpdateAccountDAOWithdraw dur = new UpdateAccountDAOWithdraw();
		List<Account> la = new ArrayList<>();
		la = accDao.SelectAccountDB("a", userName);
		for (Account a : la) {
		System.out.println(a.getAccount_Numero());
		}
		System.out.println("Enter the account number.");
		Scanner in = new Scanner(System.in);
		String accountNumero = in.next();
		System.out.println("Put how much you want to withdraw.");
		 double amount = in.nextDouble();
		 
		 dur.updateAccountDeposit(amount, userName, accountNumero);
		  
	}
}
