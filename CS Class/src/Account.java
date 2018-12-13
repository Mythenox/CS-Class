import java.text.NumberFormat;

public class Account extends Lock {
	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	private final double RATE = 0.035;
	
	private double balance;
	private String name;
	private int id;
	 
	public Account (String owner, int account, double initial) {
		name = owner;
		id = account;
		balance = initial;
	 }
	 
	public double deposit (double amount) {
		assertUnlocked(); // this method limits access unless the lock is disengaged.
		
		if (amount < 0) {
			System.out.println();
			System.out.println ("Error: Deposit amount is invalid.");
			System.out.println (id + " " + fmt.format(amount));
		 }
		else
			balance += amount;
		return balance;
	}
	 

}
