package com.example.ferin.atm.domain.account.impl;


import com.example.ferin.atm.domain.account.Account;
import com.example.ferin.atm.factories.account.AccountFactory;

public class Savings implements AccountFactory {

    public Account createAccountType(String accountNumber, double balance, double limit, String pin) {
        Account savings = new Account.Builder()
                .accountType("savings")
                .accountNumber(accountNumber)
                .balance(balance)
                .limit(limit)
                .pin(pin)
                .build();
        return savings;
    }
}
