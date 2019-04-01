public class SavingAccount extends Account {
    private double rate;
    private double loan;

    SavingAccount(int id, String name, char type, double balance, double rate, double loan) {
        super(id,name,type,balance,loan);
        this.rate = rate;
        this.loan = loan;
    }

    public boolean addInterest() {
        if (accountType == 'S') {
            balance += balance*rate;
            return true;
        }
        return false;
    }

    public boolean deductLoan() {
        if (accountType == 'C') {
            balance -= loan;
            return true;
        }
        return false;
    }
}
