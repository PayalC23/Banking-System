package BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts;

	public Bank() {
		accounts = new ArrayList<>();

	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public void removeAccount(Account account) {
		accounts.remove(account);
	}

	public void displayAccounts() {
		for (Account account : accounts) {
			System.out.println(account.getAccountInfo());
		}
	}
}