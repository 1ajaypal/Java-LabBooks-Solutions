package lab4;

import java.util.*;

public class Account {
		long accNum;
		double balance;
		Person accHolder;
	
		//constructors
		public Account() {
			//this.accNum = accNum;
			this.balance = 0.0;
			//this.accHolder = accHolder;
		}
		//getters and setters
		public long getAccNum() {
			return accNum;
		}
		public void setAccNum(long accNum) {
			this.accNum = accNum;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public Person getAccHolder() {
			return accHolder;
		}
		public void setAccHolder(Person accHolder) {
			this.accHolder = accHolder;
		}
	
		//depopsit method
		void deposit(double amount) {
			balance = balance + amount;
			System.out.println(amount + " deposited " );
		
		}
		//withdraw method
		void withdraw(double amount) {
			if(balance<amount) {
				System.out.println("Insufficient Balance");
			}
			else {
				balance = balance - amount;
				System.out.println(amount + " withdrawn by");
			}
		}
		
		//check balance
		double checkBalance() {
			return balance;
		}
		
		
		public static void main(String[] args) {
			//account for smith
			Person smith = new Person("Smith", 29);
			Account smithAcc = new Account();
			smithAcc.setAccHolder(smith);
			smithAcc.setAccNum(101);
			smithAcc.setBalance(2000);
			//account for kathy
			Person kathy = new Person("Kathy" , 30);
			Account kathyAcc = new Account();
			kathyAcc.setAccHolder(kathy);
			kathyAcc.setAccNum(102);
			kathyAcc.setBalance(3000);
			
			//checking
			smithAcc.deposit(1000);
			smithAcc.withdraw(2500);
			kathyAcc.deposit(5000);
			kathyAcc.withdraw(4200);
			System.out.println("Account balance of Smith: " + smithAcc.checkBalance());
			System.out.println("Account balance of Kathy: " + kathyAcc.checkBalance());
			
		}
		
}	
			
