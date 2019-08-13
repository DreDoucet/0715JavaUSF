package com.accountScreen;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import com.dao.AccountCreate;
import com.daoimplement.AccountDAOImplementation;
import com.daoimplement.CustomerDAOImplementation;
import com.daoimplement.FindSequenceAccountDAOImplementation;
import com.mainmenu.MainScreen;
import com.uncertainty.Account;

public class ScreenOfAccount {
	public void menuBridge() {
		FindSequenceAccountDAOImplementation fsadao = new FindSequenceAccountDAOImplementation();
		long sequence = fsadao.FindByIdRecord();
		String ssq = new String();
		ssq += sequence;
		for(int e = 1; e < 14-ssq.length(); e++) {
			ssq += "0";
		}
		
		ssq += sequence;
		Date date = Date.valueOf(LocalDate.now());
		Account account = new Account();
		AccountDAOImplementation dealy = new AccountDAOImplementation();
		
		Scanner in3 = new Scanner(System.in);
		System.out.println("Enter your username.");
		String user_name = in3.nextLine();
		
		
		
		account.setAccount_Numero(ssq);
		account.setDate_loaded(date);
		account.setAmount(0);
		account.setUser_name(user_name);
		account.setStatus("p");
		
		dealy.CreateRecord(account);
		fsadao.UpdateRecord();
		
		
		
		
		
		
		
		
		
		
	}
}
