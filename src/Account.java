
public class Account {
	private int id;
	private String strName;
	private char accountType;
	private double balance;
	
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
	
	Account(int id, String name, char type, double blance) {
		this.id = id;
		this.strName = name;
		this.accountType = type;
		this.balance = blance;
	}
	
	public void debit(double amount) {
		
	}
	
	public void credit(double amount) {
		
	}
	
	public void displayBalance() {
		
	}
	
	public static void displayAll() {
		
	}
 }
