package com.daoimplement;

import java.util.List;

import com.dao.AccountCreate;
import com.dao.CustomerCreate;
import com.generalinterface.GeneralInterface;
import com.uncertainty.Account;

public class AccountDAOImplementation implements GeneralInterface<Account> {
	
	AccountCreate acctn = new AccountCreate();
	
	

	@Override
	public boolean CreateRecord(Account t) {
		
		return acctn.addtoDB(t);
		
		
	}

	@Override
	public List<Account> FindAllRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account FindByIdRecord(Account t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean UpdateRecord(Account t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteRecord(Account t) {
		// TODO Auto-generated method stub
		return false;
	}

}
