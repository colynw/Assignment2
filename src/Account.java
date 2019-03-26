
public class Account {
	private String strName;
	private char accountType;
	private double blance;
	
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
	
	public void setBlance(double blance) {
		this.blance = blance;
	}
	
	public double getBlance() {
		return this.blance;
	}
	
	Account() {
		this.strName = "TTU1";
		this.accountType = 'C';
		this.blance = 0.0;
	}
	
	Account(String name, char type, double blance) {
		this.strName = name;
		this.accountType = type;
		this.blance = blance;
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
