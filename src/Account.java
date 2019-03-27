import javax.swing.JOptionPane;

public class Account {
	private int id;
	private String strName;
	private char accountType;
	private double balance;
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setName(String name) {
		this.strName = name;
	}
	
	public String getName() {
		return this.strName;
	}
	
	public void setAccountType(char type) {
		this.accountType = type;
	}
	
	public char getAccountType() {
		return this.accountType;
	}
	
	public void setBalance(double blance) {
		this.balance = blance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	Account() {
		this.strName = "TTU1";
		this.accountType = 'C';
		this.balance = 0.0;
	}
	
	Account(int id, String name, char type, double balance) {
		this.id = id;
		this.strName = name;
		this.accountType = type;
		this.balance = balance;
	}
	
	//withdraw
	public void debit(double amount) {
		if(balance >= amount) {
			balance-=amount;
		}else {
			JOptionPane.showMessageDialog(null, "Insufficient balance.");
		}
	}
	
	//deposit
	public void credit(double amount) {
		balance+=amount;
	}
	
	public void displayBalance() {
		JOptionPane.showMessageDialog(null, "The balance is "+balance);
	}
	
	public static void displayAll(Account[] arr) {
		String str = "";
		for (int i=0;i<arr.length;i++) {
			str += arr[i].getID() + " " + arr[i].getName() + " " +arr[i].getAccountType() + " " +arr[i].getBalance() + "\n";
		}
		JOptionPane.showMessageDialog(null, str);
	}
 }
