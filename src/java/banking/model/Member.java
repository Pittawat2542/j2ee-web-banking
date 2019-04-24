package banking.model;

import banking.bankaccount.SavingAccount;
import java.util.Vector;

public class Member {

    private static Vector members = new Vector();

    public static SavingAccount create(String firstName, String lastName, double interestRatePercentage) {
        SavingAccount newAccount = new SavingAccount(interestRatePercentage, firstName, lastName);
        members.add(newAccount);
        return newAccount;
    }

    public static SavingAccount read(String accountId) {
        int foundIndex = search(accountId);

        if (foundIndex == -1) {
            return null;
        }

        return (SavingAccount) members.get(foundIndex);
    }

    public static boolean update(String accountId, String firstName, String lastName, double balance, double interestRatePercentage, boolean isUpdateBalance, boolean isUpdateInterestRatePercentage) {
        int foundIndex = search(accountId);

        if (foundIndex == -1) {
            return false;
        }

        SavingAccount foundAccount = (SavingAccount) members.get(foundIndex);

        if (firstName != null) {
            foundAccount.setFirstName(firstName);
        }

        if (lastName != null) {
            foundAccount.setFirstName(lastName);
        }
        
        if (isUpdateBalance) {
            foundAccount.setBalance(balance);
        }
        
        if (isUpdateInterestRatePercentage) {
            foundAccount.setInterestRatePercent(interestRatePercentage);
        }
        
        return true;
    }

    public static SavingAccount delete(String accountId) {
        int foundIndex = search(accountId);
        
        if (foundIndex == -1) {
            return null;
        }
        
        SavingAccount foundAccount = (SavingAccount) members.get(foundIndex);
        
        members.removeElementAt(foundIndex);
        
        return foundAccount;
    }

    public static int search(String accountId) {
        int foundIndex = -1;
        for (int i = 0; i < members.size(); i++) {
            if (accountId.equals(((SavingAccount) members.get(i)).getAccountId())) {
                foundIndex = i;
            }
        }

        return foundIndex;
    }
    
    public static Vector getAllMembers() {
        return members;
    }
}
