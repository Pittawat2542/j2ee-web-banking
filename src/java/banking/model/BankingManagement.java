package banking.model;

import banking.bankaccount.BankAccount;
import banking.bankaccount.SavingAccount;

public class BankingManagement {

    public static boolean transfer(String origin, String destination, double amount) {
        BankAccount from = Member.searchBankAccountFromDB(origin);
        BankAccount to = Member.searchBankAccountFromDB(destination);

        if (from != null && to != null) {
            if (withdraw(origin, amount)) {
                deposit(destination, amount);
                return true;
            }
            return false;
        } else {
            if (from == null) {
                System.out.println("Cannot find origin account in our system!");
            }

            if (to == null) {
                System.out.println("Cannot find destination account in our system!");
            }
            return false;
        }
    }

    public static boolean withdraw(String origin, double amount) {
        BankAccount account = Member.searchBankAccountFromDB(origin);

        if (account != null) {
            if (account.getBalance() >= amount) {
                Member.update(origin, null, null, null, null, null, account.getBalance() - amount, 0, true, false);
                System.out.println("Completed!");
                return true;
            } else {
                System.out.println("Balance not enough!");
                return false;
            }
        } else {
            System.out.println("Cannot find account in our system!");
            return false;
        }
    }

    public static boolean deposit(String origin, double amount) {
        BankAccount account = Member.searchBankAccountFromDB(origin);

        if (account != null) {
            Member.update(origin, null, null, null, null, null, account.getBalance() + amount, 0, true, false);
            System.out.println("Completed!");
            return true;
        } else {
            System.out.println("Cannot find account in our system!");
            return false;
        }
    }
    
    public static boolean delete(String accountId) {
        BankAccount account = Member.delete(accountId);
        
        if (account != null) {
            System.out.println("Completed!");
            return true;
        } else {
            System.out.println("Cannot find account in our system!");
            return false;
        }
    }
}
