package com.daoimplement;

import java.util.List;

import com.dao.AccessSystemDAO;
import com.dao.CustomerCreate;
import com.generalinterface.GeneralInterface;
import com.uncertainty.Customer;

public class CustomerDAOImplementation implements GeneralInterface<Customer> {
	
	CustomerCreate custn = new CustomerCreate();
	AccessSystemDAO custasd = new AccessSystemDAO();

	@Override
	public boolean CreateRecord(Customer t) {
		// TODO Auto-generated method stub
		return custn.addtoDB(t);
	}

	@Override
	public List<Customer> FindAllRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer FindByIdRecord(Customer t) {
		// TODO Auto-generated method stub
		return custasd.custa(t);
	}

	@Override
	public boolean UpdateRecord(Customer t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteRecord(Customer t) {
		// TODO Auto-generated method stub
		return false;
	}

}
