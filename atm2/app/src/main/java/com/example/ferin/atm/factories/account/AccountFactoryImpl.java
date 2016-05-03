package com.example.ferin.atm.factories.account;


import com.example.ferin.atm.domain.account.impl.Credit;
import com.example.ferin.atm.domain.account.impl.Savings;
import com.example.ferin.atm.domain.account.impl.Student;

public abstract class AccountFactoryImpl {

    public static AccountFactory getAccountType(String type)
    {
        if(type.equalsIgnoreCase("credit"))
            return new Credit();
        if(type.equalsIgnoreCase("savings"))
            return new Savings();
        if(type.equalsIgnoreCase("Student"))
            return new Student();
        else
        return null;
    }
}
