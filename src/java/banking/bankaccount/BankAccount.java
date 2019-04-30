package banking.bankaccount;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BankAccount {

    private String accountId;
    private String name;
    private double balance;
    private String address;
    private String district;
    private String province;
    private String phoneNumber;

    public BankAccount(String name, double balance, String address, String district, String province, String phoneNumber) {
        accountId = java.util.UUID.randomUUID().toString();
        this.name = name;
        this.balance = balance;
        this.address = address;
        this.district = district;
        this.province = province;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(ResultSet rs) throws SQLException {
        accountId = rs.getString("accountNumber");
        name = rs.getString("accountName");
        address = rs.getString("address");
        district = rs.getString("district");
        province = rs.getString("province");
        phoneNumber = rs.getString("phoneNumber");
        balance = Double.parseDouble(rs.getString("amount"));
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
