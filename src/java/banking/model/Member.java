package banking.model;

import banking.bankaccount.BankAccount;
import banking.bankaccount.SavingAccount;
import banking.utils.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Member {

    private static Vector members = new Vector();

    public static SavingAccount create(String name, String address, String district, String province, String phoneNumber, double interestRatePercent) {
        SavingAccount newAccount = new SavingAccount(interestRatePercent, name, 0, address, district, province, phoneNumber);
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

    public static boolean update(String accountId, String name, String address, String district, String province, String phoneNumber, double balance, double interestRatePercentage, boolean isUpdateBalance, boolean isUpdateInterestRatePercentage) {
        int foundIndex = search(accountId);

        if (foundIndex == -1) {
            return false;
        }

        SavingAccount foundAccount = (SavingAccount) members.get(foundIndex);

        if (name != null) {
            foundAccount.setName(name);
        }

        if (address != null) {
            foundAccount.setAddress(address);
        }

        if (district != null) {
            foundAccount.setDistrict(district);
        }

        if (province != null) {
            foundAccount.setProvince(province);
        }

        if (phoneNumber != null) {
            foundAccount.setPhoneNumber(phoneNumber);
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

    public static BankAccount searchBankAccountFromDB(String accountId) {
        BankAccount bankAccount = null;
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.getMySQLConnection();
            pstm = conn.prepareStatement("SELECT * FROM bank_account WHERE accountNumber = " + accountId);
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

    public static Vector getAllMembers() {
        return members;
    }
}
