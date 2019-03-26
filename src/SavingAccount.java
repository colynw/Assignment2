
public class SavingAccount extends Account {
	private double rate;
	
	SavingAccount(int id, String name, char type, double blance, double rate) {
		super(id,name,type,blance);
		this.rate = rate;
	}
	
	public void addInterest() {
		
	}
	
	public void deductLoan() {
		
	}
	
}
