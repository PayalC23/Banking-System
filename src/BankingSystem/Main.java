package BankingSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Bank bank = new Bank();

		SavingsAccount savingsAccount = new SavingsAccount(123, "Payal Chaudhari", 10000, 1.05);
		CheckingAccount checkingAccount = new CheckingAccount(456, "Pooja Lokhande", -200, 200);

		bank.addAccount(savingsAccount);
		bank.addAccount(checkingAccount);

		savingsAccount.deposit(100);
		checkingAccount.withdraw(200);
		System.out.println("==================================================");
		bank.displayAccounts();
		System.out.println("==================================================");

		System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());
		checkingAccount.checkOverdraft();
	}

}*/

// calculate interest - 1500 * 0.05 = 75.0
		
		
		        Bank bank = new Bank();
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Welcome to Baking System....");
		        System.out.println("\n======================================================");
		        System.out.print("Enter account number for Savings Account: ");
		        int savingsAccountNumber = sc.nextInt();
		        System.out.print("Enter account holder name for Savings Account: ");
		        String savingsAccountHolderName = sc.next();
		        System.out.print("Enter initial balance for Savings Account: ");
		        double savingsAccountBalance = sc.nextDouble();
		        System.out.print("Enter interest rate for Savings Account: ");
		        double savingsAccountInterestRate = sc.nextDouble();

		        SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber, savingsAccountHolderName, savingsAccountBalance, savingsAccountInterestRate);
		        System.out.print("Enter amount to deposit into Savings Account: ");
		        double depositAmount = sc.nextDouble();
		        savingsAccount.deposit(depositAmount);
		        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());
		        System.out.println("====================================================");
		        System.out.print("Enter account number for Checking Account: ");
		        int checkingAccountNumber = sc.nextInt();
		        System.out.print("Enter account holder name for Checking Account: ");
		        String checkingAccountHolderName = sc.next();
		        System.out.print("Enter initial balance for Checking Account: ");
		        double checkingAccountBalance = sc.nextDouble();
		        System.out.print("Enter overdraft limit for Checking Account: ");
		        double checkingAccountOverdraftLimit = sc.nextDouble();
		     
		        CheckingAccount checkingAccount = new CheckingAccount(checkingAccountNumber, checkingAccountHolderName, checkingAccountBalance, checkingAccountOverdraftLimit);

		        bank.addAccount(savingsAccount);
		        bank.addAccount(checkingAccount);

		        
		        System.out.print("Enter amount to withdraw from Checking Account: ");
		        double withdrawAmount = sc.nextDouble();
		       
		        
		        checkingAccount.checkOverdraft();
		        checkingAccount.withdraw(withdrawAmount);
		        
		        System.out.println("======================================================");
		        bank.displayAccounts();
		        System.out.println("======================================================");
		        System.out.println("Thank You for Banking with us...");
		    }
		}
