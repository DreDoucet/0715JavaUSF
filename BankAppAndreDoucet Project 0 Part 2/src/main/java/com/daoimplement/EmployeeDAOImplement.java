package com.daoimplement;

import java.util.List;

import com.dao.AccessSystemDAO;
import com.dao.EmployeeCreate;
import com.generalinterface.GeneralInterface;
import com.uncertainty.Employee;
import com.dao.AccessSystemDAO;

public class EmployeeDAOImplement implements GeneralInterface<Employee> {
	
	EmployeeCreate empyn = new EmployeeCreate();
	
	AccessSystemDAO empro = new AccessSystemDAO();

	@Override
	public boolean CreateRecord(Employee t) {
		// TODO Auto-generated method stub
		return empyn.addtoDB(t);
	}

	@Override
	public List<Employee> FindAllRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee FindByIdRecord(Employee t) {
		// TODO Auto-generated method stub
		return empro.emplo(t);
	}

	@Override
	public boolean UpdateRecord(Employee t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteRecord(Employee t) {
		// TODO Auto-generated method stub
		return false;
	}

}
