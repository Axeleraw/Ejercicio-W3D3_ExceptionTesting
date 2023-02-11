package org.bank;

import java.math.BigDecimal;

public class Account {
    private String name;
    private String adress;
    private BigDecimal balance;
    private int accountNumber;

    public Account() {
        setName(name);
        setAdress(adress);
        setBalance(balance);
        setAccountNumber(accountNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
