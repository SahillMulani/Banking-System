package banking;

import java.util.LinkedHashMap;
import java.util.Random;
/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;

	public Bank() {
		// complete the function
		accounts = new LinkedHashMap<Long, Account>();
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
        return accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		long newAccountNumber = new random.nextLong();
		var newAccount = new CommercialAccount(company, newAccountNumber, pin, startingDeposit);
		accounts.add(newAccountNumber, newAccount);
        return newAccountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		long newAccountNumber = new random.nextLong();
		var newAccount = new ConsumerAccount(person, newAccountNumber, pin, startingDeposit);
		accounts.add(newAccountNumber, newAccount);
        return newAccountNumber;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		var entry = accounts.get(accountNumber);
		if(entry != null && entry.pin == pin)
        	return true;
		return false;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
        return accounts.get(accountNumber).balance;
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		accounts.get(accountNumber).balance += amount;
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		var entry = accounts.get(accountNumber);
		if(amount<=entry.balance){
			this.balance -=amount;
			return true;
		}
        return false;
	}
}
