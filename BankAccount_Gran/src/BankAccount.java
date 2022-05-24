
abstract class BankAccount {
	
	double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	public void withdraw(double amount) {
		if((this.balance - amount) < 0) 
			this.balance = 0;
		else 
			this.balance = this.balance - amount;
			
	}
	
	public abstract void display();
}
