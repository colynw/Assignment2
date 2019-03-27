
public class SavingAccount extends Account {
	private double rate;
	
	SavingAccount(int id, String name, char type, double balance, double rate) {
		super(id,name,type,balance);
		this.rate = rate;
	}
	
	public void addInterest() {
		
	}
	
	public void deductLoan() {
		
	}
	
}
