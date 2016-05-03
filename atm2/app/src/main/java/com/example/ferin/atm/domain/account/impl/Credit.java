package com.example.ferin.atm.domain.account.impl;


import com.example.ferin.atm.domain.account.Account;
import com.example.ferin.atm.factories.account.AccountFactory;

public class Credit implements AccountFactory {

    public Account createAccountType(String accountNumber, double balance, double limit, String pin) {
        Account credit = new Account.Builder()
                .accountNumber(accountNumber)
                .balance(balance)
                .limit(limit)
                .pin(pin)
                .accountType("credit")
                .build();
        return credit;
    }
}
