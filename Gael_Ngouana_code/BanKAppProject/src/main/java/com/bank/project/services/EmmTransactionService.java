package com.bank.project.services;

import java.util.List;

import com.bank.project.dao.account.UpdateAccountByEmployeeDao;
import com.bank.project.inteface.GeneralRepository;
import com.bank.project.model.Transaction;

public class EmmTransactionService implements GeneralRepository<Transaction>{

	UpdateAccountByEmployeeDao transaction = new UpdateAccountByEmployeeDao();
	Transaction trans = new Transaction();
	@Override
	public boolean createRegister(Transaction t) {
		return transaction.updateAccount(t.getAccountNumber(), t.getAmount(), t.getKindTransaction(), t, t.getId());
	}

	@Override
	public List<Transaction> finAllRegister() {
		return null;
	}

	@Override
	public Transaction findById(Transaction t) {
		return null;
	}

	@Override
	public boolean updateRegister(Transaction t) {
		return false;
	}

	@Override
	public boolean deleteRegister(Transaction t) {
		return false;
	}

		

}