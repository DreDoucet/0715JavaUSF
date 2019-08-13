package com.daoimplement;

import java.util.List;

import com.dao.AccessSystemDAO;
import com.dao.AdminCreate;
import com.generalinterface.GeneralInterface;
import com.uncertainty.Admin;

/*
 * 
 * import java.util.List;
 * import com.dao.CustomerCreate;
 * import com.generalinterface.GeneralInterface;
 * import com.uncertainty.Customer;
 */

public class AdminDAOImplementation implements GeneralInterface<Admin> {
	AdminCreate admn = new AdminCreate();
	AccessSystemDAO admindao = new AccessSystemDAO();

	@Override
	public boolean CreateRecord(Admin t) {
		return admn.addtoDB(t);
	}

	@Override
	public List<Admin> FindAllRecords() {
		return null;
	}

	@Override
	public Admin FindByIdRecord(Admin t) {
		return admindao.admio(t);
	}

	@Override
	public boolean UpdateRecord(Admin t) {
		return false;
	}

	@Override
	public boolean DeleteRecord(Admin t) {
		return false;
	}

}
