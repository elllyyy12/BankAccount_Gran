
public class Checking extends BankAccount{
	
	public Checking(double balance) {
		super(balance);
	}
	
	public void writeACheck(double amount) {
		if ((this.balance - amount - 1) < 0)
			this.balance = 0;
		else
			this.balance = this.balance - amount - 1;
	}
	
	@Override
	public void display() {
		System.out.println("Checking account balance = $" + this.balance);
	}
}
