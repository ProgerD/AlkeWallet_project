package com.alkewallet.service;

import com.alkewallet.model.Account;

public class AccountService {
    private Account account;

    public AccountService() {
        this.account = new Account();
    }

    public double getBalance() {
        return account.getBalance();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            account.deposit(amount);
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= account.getBalance()) {
            account.withdraw(amount);
            return true;
        }
        return false;
    }
}
