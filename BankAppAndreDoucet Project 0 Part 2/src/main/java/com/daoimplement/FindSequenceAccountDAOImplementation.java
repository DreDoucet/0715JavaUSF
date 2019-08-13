package com.daoimplement;

import java.util.List;

import com.generalinterface.GeneralInterface;
import com.sequenceaccountdao.FindSequenceAccountDAO;
import com.sequenceaccountdao.UpdateSequenceAccountDAO;
import com.uncertainty.AccountParameters;

public class FindSequenceAccountDAOImplementation implements GeneralInterface<AccountParameters> {
	
	FindSequenceAccountDAO fsadao = new FindSequenceAccountDAO();
	UpdateSequenceAccountDAO usadao = new UpdateSequenceAccountDAO();

	@Override
	public boolean CreateRecord(AccountParameters t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<AccountParameters> FindAllRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountParameters FindByIdRecord(AccountParameters t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public long FindByIdRecord() {
		return fsadao.FindById();
		
	}

	@Override
	public boolean UpdateRecord(AccountParameters t) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean UpdateRecord() {
		return usadao.updateRecord();
	}

	@Override
	public boolean DeleteRecord(AccountParameters t) {
		// TODO Auto-generated method stub
		return false;
	}

}
