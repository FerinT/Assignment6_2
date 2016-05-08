package com.example.ferin.atm.factories.client;


import com.example.ferin.atm.domain.client.Client;
import com.example.ferin.atm.domain.client.impl.Business;
import com.example.ferin.atm.domain.client.impl.Premium;
import com.example.ferin.atm.domain.client.impl.Standard;

public abstract class ClientFactoryImpl {

    public static Client getClientType(String type, String idNumber, String name, String email, Long id)
    {
        if(type.equalsIgnoreCase("business")) {
            return new Business.Builder()
                    .idNumber(idNumber)
                    .name(name)
                    .emailAddress(email)
                    .build();
        }
        if(type.equalsIgnoreCase("premium")) {
            return new Premium.Builder()
                    .idNumber(idNumber)
                    .name(name)
                    .emailAddress(email)
                    .build();
        }
        if(type.equalsIgnoreCase("standard")) {
            return new Standard.Builder()
                    .idNumber(idNumber)
                    .name(name)
                    .emailAddress(email)
                    .build();
        }
        else
            return null;
    }

}
