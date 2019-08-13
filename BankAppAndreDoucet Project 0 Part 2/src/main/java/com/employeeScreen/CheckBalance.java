package com.employeeScreen;

import java.util.ArrayList;
import java.util.List;

import com.dao.AccountSelect;
import com.dao.AccountUpdate;
import com.mainmenu.MainScreen;
import com.uncertainty.Account;
import com.uncertainty.Customer;

public class CheckBalance {
	
	public static AccountSelect accSel = new AccountSelect();
	
	public void chequeBal() {
		List<Account> ls = new ArrayList<>();
		AccountUpdate accUp = new AccountUpdate();
		ls = accSel.SelectAccountDB("a");
		if (ls != null) {
			for (Account a : ls) {
				if (a.getStatus().equals("a")) {
					System.out.println(a.getAccount_Numero() + " " + a.getAmount());
				}
			}
		}
	}
}
