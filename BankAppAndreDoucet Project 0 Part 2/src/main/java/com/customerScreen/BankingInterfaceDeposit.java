package com.customerScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.dao.AccountDAOCustomer;
import com.dao.UpdateAccountDAODeposit;
import com.drivers.DataDBDriver;
import com.mainmenu.MainScreen;
import com.uncertainty.Account;
import com.uncertainty.Customer;


public class BankingInterfaceDeposit {
	public void MoneyTime(String userName) {
		AccountDAOCustomer accDao = new AccountDAOCustomer();
		UpdateAccountDAODeposit dur = new UpdateAccountDAODeposit();
		List<Account> la = new ArrayList<>();
		la = accDao.SelectAccountDB("a", userName);
		for (Account a : la) {
		System.out.println(a.getAccount_Numero());
		}
		System.out.println("Enter the account number.");
		Scanner in = new Scanner(System.in);
		String accountNumero = in.next();
		System.out.println("Put how much you want to deposit.");
		 double amount = in.nextDouble();
		 
		 dur.updateAccountDeposit(amount, userName, accountNumero);
		  
	}
}
