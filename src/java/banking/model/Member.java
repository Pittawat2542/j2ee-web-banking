package banking.model;

import banking.bankaccount.BankAccount;
import banking.bankaccount.SavingAccount;
import banking.utils.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Member {

    public static SavingAccount create(String name, String address, String district, String province, String phoneNumber, double interestRatePercent) {
        SavingAccount newAccount = new SavingAccount(interestRatePercent, name, 0, address, district, province, phoneNumber);
        addBankAccountToDB(newAccount.getAccountId(), name, address, district, province, phoneNumber, newAccount.getBalance());

        return newAccount;
    }

    public static BankAccount searchBankAccountFromDB(String accountId) {
        BankAccount bankAccount = null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {

            conn = DBConnection.getMySQLConnection();
            pstm = conn.prepareStatement("SELECT * FROM bank_account WHERE accountNumber = '" + accountId + "'");
            rs = pstm.executeQuery();

            if (rs.next()) {
                bankAccount = new BankAccount(rs);
            }

            return bankAccount;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstm.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void addBankAccountToDB(String accountNumber, String accountName, String address, String district, String province, String phoneNumber, double amount) {
        BankAccount bankAccount = null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        boolean executeState = false;
        String executeMessage;

        try {
            conn = DBConnection.getMySQLConnection();
            String statement = String.format("INSERT INTO bank_account VALUES ('%s','%s','%s','%s','%s',%s,%s)", accountNumber, accountName, address, district, province, phoneNumber, amount);
            System.out.println(statement);
            pstm = conn.prepareStatement(statement);
            executeState = pstm.execute();
            executeMessage = "INSERT SUCCESSFUL";

        } catch (Exception e) {
            e.printStackTrace();
            executeMessage = "INSERT FAILED";
        }

    }

    public static void update(String accountId, String name, String address, String district, String province, String phoneNumber, double balance, double interestRatePercentage, boolean isUpdateBalance, boolean isUpdateInterestRatePercentage) {
        BankAccount bankAccount = null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        boolean executeState = false;
        String executeMessage;
        String statements = "";

        if (name != null) {
            statements += ("accountName = " + name);
        }

        if (address != null) {
            if (statements.length() != 0) {
                statements += ", ";
            }
            statements += ("address = " + address);
        }

        if (district != null) {
            if (statements.length() != 0) {
                statements += ", ";
            }
            statements += ("district = " + district);
        }

        if (province != null) {
            if (statements.length() != 0) {
                statements += ", ";
            }
            statements += ("province = " + province);
        }

        if (phoneNumber != null) {
            if (statements.length() != 0) {
                statements += ", ";
            }
            statements += ("phoneNumber = " + phoneNumber);
        }

        if (isUpdateBalance) {
            if (statements.length() != 0) {
                statements += ", ";
            }
            statements += ("amount = " + balance);
        }

        try {
            conn = DBConnection.getMySQLConnection();
            String statement = String.format("UPDATE bank_account SET " + statements + " WHERE accountNumber = '" + accountId + "'");
            System.out.println(statement);
            pstm = conn.prepareStatement(statement);
            executeState = pstm.execute();
            executeMessage = "UPDATE SUCCESSFUL";

        } catch (Exception e) {
            e.printStackTrace();
            executeMessage = "UPDATE FAILED";
        }

    }

    public static BankAccount delete(String accountId) {
        BankAccount bankAccount = null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        boolean executeState = false;
        String executeMessage;
        String statements = "";
        
        BankAccount result = searchBankAccountFromDB(accountId);

        try {
            conn = DBConnection.getMySQLConnection();
            String statement = String.format("DELETE FROM bank_account WHERE accountNumber = '" + accountId + "'");
            System.out.println(statement);
            pstm = conn.prepareStatement(statement);
            executeState = pstm.execute();
            executeMessage = "DELETE SUCCESSFUL";
        } catch (Exception e) {
            e.printStackTrace();
            executeMessage = "DELETE FAILED";
        } finally {
            return result;
        }
    }

    public static Vector getAllAccountsFromDB() {
        Vector result = new Vector();
        BankAccount bankAccount = null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.getMySQLConnection();
            pstm = conn.prepareStatement("SELECT * FROM bank_account");
            rs = pstm.executeQuery();

            while (rs.next()) {
                bankAccount = new BankAccount(rs);
                result.add(bankAccount);
            }

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstm.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
