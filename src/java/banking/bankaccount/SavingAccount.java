package banking.bankaccount;

public class SavingAccount extends BankAccount {
    private double interestRatePercent;

    public SavingAccount(double interestRatePercent, String ownerFirstName, String ownerLastName) {
        super(ownerFirstName, ownerLastName);
        this.interestRatePercent = interestRatePercent;
    }

    public double getInterestRatePercent() {
        return interestRatePercent;
    }

    public void setInterestRatePercent(double interestRatePercent) {
        this.interestRatePercent = interestRatePercent;
    }
    
    public double calculateInterestAmount() {
        return interestRatePercent * super.getBalance();
    }
}
