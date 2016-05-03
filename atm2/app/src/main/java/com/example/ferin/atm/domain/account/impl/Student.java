package com.example.ferin.atm.domain.account.impl;


import com.example.ferin.atm.domain.account.Account;
import com.example.ferin.atm.factories.account.AccountFactory;

public class Student implements AccountFactory {

    public Account createAccountType(String accountNumber, double balance, double limit, String pin) {
        Account student = new Account.Builder()
                .accountType("student")
                .accountNumber(accountNumber)
                .balance(balance)
                .limit(limit)
                .pin(pin)
                .build();
        return student;
    }

}
