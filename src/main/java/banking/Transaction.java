package banking;

/**
 *
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction {
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank
	 *            The bank where the account is housed.
	 * @param accountNumber
	 *            The customer's account number.
	 * @param attemptedPin
	 *            The PIN entered by the customer.
	 * @throws Exception
	 *             Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		// complete the function
		this.bank = bank;
		this.accountNumber = accountNumber;
		var entry = this.bank.getAccounts().get(accountNumber);
		if(entry.getPin() != attemptedPin)
			throw new Exception("Pin Mismatch!!!");
	}

	public double getBalance() {
		// complete the function
        return this.bank.getAccounts().get(this.accountNumber).getBalance();
	}

	public void credit(double amount) {
		// complete the function
		return this.bank.getAccounts().get(this.accountNumber).credit(amount);
	}

	public boolean debit(double amount) {
		// complete the function
        return this.bank.getAccounts().get(this.accountNumber).debit(amount);
	}
}
