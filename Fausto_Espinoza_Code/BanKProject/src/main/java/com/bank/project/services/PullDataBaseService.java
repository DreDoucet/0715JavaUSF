package com.bank.project.services;

import java.io.File;

import com.bank.project.FileNumberTXT;
import com.bank.project.FileWriterTXT;
import com.bank.project.MainEntry;
import com.bank.project.inteface.PullDataBase;
import com.bank.project.model.Account;
import com.bank.project.model.Customer;
import com.bank.project.model.Employee;
import com.bank.project.model.JointAccount;
import com.bank.project.model.Transaction;

public class PullDataBaseService implements PullDataBase {

	@Override
	public void findAllCustumers() {
		String fileName = "./DataBase/Custumer.txt";
		File file = new File(fileName);
		if(file.exists()) {
			FileWriterTXT<Customer> fileSystem = new FileWriterTXT();
			MainEntry.custumer =  fileSystem.readFile(fileName);
		}
	}

	@Override
	public void findAllAcounts() {
		String fileName = "./DataBase/Account.txt";
		File file = new File(fileName);
		if(file.exists()) {
			FileWriterTXT<Account> fileSystem = new FileWriterTXT();
			MainEntry.account =  fileSystem.readFile(fileName);
		}
		
		String fileNumber = "./DataBase/numberAccount.txt";
		File file1 = new File(fileNumber);
		if(file1.exists()) {
			FileNumberTXT fileSys = new FileNumberTXT();
			MainEntry.numberAccount = fileSys.readFile(fileNumber);
		}else MainEntry.numberAccount = 1;
	}

	@Override
	public void findAllTransaction() {
		String fileName = "./DataBase/Transaction.txt";
		File file = new File(fileName);
		if(file.exists()) {
			FileWriterTXT<Transaction> fileSystem = new FileWriterTXT();
			MainEntry.transaction =  fileSystem.readFile(fileName);
		}		
	}

	@Override
	public void findAllEmployees() {
		String fileName = "./DataBase/Employee.txt";
		File file = new File(fileName);
		if(file.exists()) {
			FileWriterTXT<Employee> fileSystem = new FileWriterTXT();
			MainEntry.employee =  fileSystem.readFile(fileName);
		}	
	}

	@Override
	public void findAllJointAccounts() {
		String fileName = "./DataBase/JointAccount.txt";
		File file = new File(fileName);
		if(file.exists()) {
			FileWriterTXT<JointAccount> fileSystem = new FileWriterTXT();
			MainEntry.jtAccount =  fileSystem.readFile(fileName);
		}
		
	}

}