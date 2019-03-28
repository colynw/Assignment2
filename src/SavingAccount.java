
public class SavingAccount extends Account {
	private double rate;

	SavingAccount(int id, String name, char type, double balance, double rate) {
		super(id,name,type,balance);
		this.rate = rate;
	}

	public boolean addInterest() {
		if (accountType == 'S') {
			balance += balance*rate;
			return true;
		}
		return false;
	}

	public void deductLoan() {

	}

}
