package com.example.ferin.atm.factories.client;


import com.example.ferin.atm.domain.client.Client;
import com.example.ferin.atm.domain.client.impl.Business;
import com.example.ferin.atm.domain.client.impl.Premium;
import com.example.ferin.atm.domain.client.impl.Standard;

public abstract class ClientFactoryImpl {

    public static Client getClientType(String type, String idNumber, String name, String email, Long id)
    {
        if(type.equalsIgnoreCase("business"))
            return new Business.Builder().build();
        if(type.equalsIgnoreCase("premium"))
            return new Premium.Builder().build();
        if(type.equalsIgnoreCase("standard"))
            return new Standard.Builder().build();
        else
            return null;
    }

}
