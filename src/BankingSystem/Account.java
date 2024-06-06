package BankingSystem;

abstract class Account {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	private String accountType;

	public Account(int accountNumber, String accountHolderName, double balance, String accountType) {
		this.setAccountNumber(accountNumber);
		this.setAccountHolderName(accountHolderName);
		this.setBalance(balance);
		this.setAccountType(accountType);
	}

	abstract void deposit(double amount);

	abstract void withdraw(double amount);

	abstract String getAccountInfo();

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
