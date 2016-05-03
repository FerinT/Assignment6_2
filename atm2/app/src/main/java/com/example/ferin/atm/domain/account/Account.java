package com.example.ferin.atm.domain.account;

import com.example.ferin.atm.domain.client.Client;

import java.io.Serializable;


public class Account implements Serializable {

    private static Account account = null;

    private String accountNumber;
    private String accountType;
    private double balance;
    private double limit;
    private String pin;
    private Client client;


    private Account(){};

    private Account(Builder builder)
    {
        this.accountNumber = builder.accountNumber;
        this.accountType = builder.accountType;
        this.balance = builder.balance;
        this.limit = builder.limit;
    }

    public static Account getInstance()
    {
        if(account == null)
            account = new Account();
        return account;
    }

    public String getPin() {
        return pin;
    }

    public Client getClient() {
        return client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public double getLimit() {
        return limit;
    }

    public void debit(double amount)
    {
        this.balance = this.balance - amount;
    }

    public void credit(double amount)
    {
        this.balance = this.balance + amount;
    }

    public static class Builder
    {
        private String accountNumber;
        private String accountType;
        private double balance;
        private double limit;
        private String pin;
        private Client client;


        public Builder pin(String value)
        {
            this.pin = value;
            return this;
        }

        public Builder client(Client value)
        {
            this.client = value;
            return this;
        }

        public Builder accountNumber(String accountNumber)
        {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder accountType(String accountType)
        {
            this.accountType = accountType;
            return this;
        }

        public Builder balance(double balance)
        {
            this.balance = balance;
            return this;
        }

        public Builder limit(double limit)
        {
            this.limit = limit;
            return this;
        }

        public Builder copy(Account account)
        {
            this.accountNumber = account.accountNumber;
            this.accountType = account.accountType;
            this.balance = account.balance;
            this.limit = account.limit;
            this.client = account.client;
            this.pin = account.pin;

            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }
}
