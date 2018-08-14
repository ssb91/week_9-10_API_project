package service;

import java.util.Hashtable;


import org.springframework.stereotype.Component;

import model.Account;

@Component

public class Service {
	
	Hashtable<String, Account> account = new Hashtable<String, Account>();
	public Service() {
		
		Account acc = new Account();
		acc.setId(1);
		acc.setFirstName("A");
		acc.setLastName("B");
		account.put("1", acc);
	}	
	
	public Account getAccount(String id) {
		if (account.containsKey(id))
			return account.get(id);
		else
			return null;
	}
	public Hashtable<String, Account> getAll() {
		return account;
	}
}
