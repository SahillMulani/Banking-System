package banking;

public class ConsumerAccount implements Account {
	public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
		// complete the function
		this.accountHolder = person;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = currentBalance;
	}
}
