
public class Savings extends BankAccount{
	
	double interestRate;
	
	public Savings(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		this.balance = this.balance * this.interestRate;
	}
	
	@Override
	public void display() {
		System.out.println("Savings account balance = $" + this.balance);
	}
}
