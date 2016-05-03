package com.example.ferin.atm.factories.account;


import com.example.ferin.atm.domain.account.Account;

public interface AccountFactory {
    Account createAccountType(String accountNumber, double balance, double limit, String pin);
}
