package com.example.ferin.atm.factories.account;


import com.example.ferin.atm.domain.account.Account;
import com.example.ferin.atm.domain.account.impl.Credit;
import com.example.ferin.atm.domain.account.impl.Savings;
import com.example.ferin.atm.domain.account.impl.Student;

public abstract class AccountFactoryImpl {

    public static Account getAccountType(String type)
    {
        if(type.equalsIgnoreCase("credit"))
            return new Credit.Builder().build();
        if(type.equalsIgnoreCase("savings"))
            return new Savings.Builder().build();
        if(type.equalsIgnoreCase("Student"))
            return new Student.Builder().build();
        else
        return null;
    }
}
