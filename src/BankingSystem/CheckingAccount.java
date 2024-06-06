package BankingSystem;

public class CheckingAccount extends Account {
	private double overdraftLimit;

	public CheckingAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
		super(accountNumber, accountHolderName, balance, "Checking");
		// this.overdraftLimit = overdraftLimit;

	}

	@Override
	void deposit(double amount) {
		setBalance(getBalance() + amount);

	}

	@Override
	void withdraw(double amount) {
		if (getBalance() + overdraftLimit >= amount) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("Insufficient funds");
		}
	}

	@Override
	String getAccountInfo() {
		return "Account Number: " + getAccountNumber() + ", \nAccount Holder Name: " + getAccountHolderName()
				+ ", \nBalance: " + getBalance() + ", \nAccount Type: " + getAccountType();

	}

	public void checkOverdraft() {
		if (getBalance() < 0) {
			System.out.println("Account is overdrawn");
		}
	}
}