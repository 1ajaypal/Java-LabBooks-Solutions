package lab4;

public class SavingAccount extends Account {
	final double minimumBalance = 1000;
	//constructor
	public SavingAccount() {
		super();
	}
	
	@Override
	void withdraw(double amount) {
		if(balance<amount+1000) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance = balance - amount;
			System.out.println(amount + "Withdrawn");
		}
	}
}
