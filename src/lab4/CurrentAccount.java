package lab4;

public class CurrentAccount extends Account{
	final double overDraftLimit = 1000;
	//constructor
	public CurrentAccount() {
		super();
	}
	
	@Override
	void withdraw(double amount) {
		if(balance< amount+1000) {
			System.out.println("Over Draft limit reached");
		}
		else {
			System.out.println(amount+ "withdrawn");
		}
	}
}
