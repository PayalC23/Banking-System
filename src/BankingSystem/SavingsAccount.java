package BankingSystem;

public class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance, "Savings");
		this.interestRate = interestRate;
	}

	@Override
	void deposit(double amount) {
		setBalance(getBalance() + amount);

	}

	@Override
	void withdraw(double amount) {
		if (getBalance() >= amount) {
			setBalance(getBalance() - amount);
			 interestRate = getBalance() * 0.05; 
		} else {
			System.out.println("Insufficient funds");
		}

	}

	@Override
	String getAccountInfo() {
		return "Account Number: " + getAccountNumber() + ", \nAccount Holder Name: " + getAccountHolderName()
				+ ", \nBalance: " + getBalance() + ", \nAccount Type: " + getAccountType() + "\n==================================================";
 
	} 
	
	
	public double calculateInterest() {
		return getBalance() * interestRate;
	}
	
	
}