package com.employeeScreen;

import java.util.ArrayList;
import java.util.List;

import com.dao.AccountSelect;
import com.dao.AccountUpdate;
import com.mainmenu.MainScreen;
import com.uncertainty.Account;
import com.uncertainty.Customer;
import com.dao.CustomerSelect;

public class CustInfoLookup {
	public void custInfoLookup() {
		List<Customer> cls = new ArrayList<>();
		CustomerSelect custSel = new CustomerSelect();
		cls = custSel.SelectCustomerDB();
			for (Customer c : cls) {
				
					System.out.println(c.getName() + " " + c.getAddress() + " " + c.getTelephonenumber());
				
			
		}
	}

}
