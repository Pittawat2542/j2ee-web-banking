package banking.bankaccount;

public class SavingAccount extends BankAccount {
    private double interestRatePercent;

    public SavingAccount(double interestRatePercent, String name, double balance, String address, String district, String province, String phoneNumber) {
        super(name, balance, address, district, province, phoneNumber);
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
