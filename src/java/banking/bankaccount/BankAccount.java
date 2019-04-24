package banking.bankaccount;

public class BankAccount {
    private String accountId;
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName) {
        accountId = java.util.UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String ownerFirstName) {
        this.firstName = ownerFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String ownerLastName) {
        this.lastName = ownerLastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
