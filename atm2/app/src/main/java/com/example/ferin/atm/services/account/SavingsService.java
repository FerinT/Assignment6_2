package com.example.ferin.atm.services.account;

import android.content.Context;

import com.example.ferin.atm.domain.account.impl.Savings;

/**
 * Created by Ferin on 2016-05-13.
 */
public interface SavingsService {
    void addAccount(Context context, Savings savings);
    void updateAcount(Context context, Savings savings);
}
