package com.example.ferin.atm.factories.client;


import com.example.ferin.atm.domain.client.impl.Business;
import com.example.ferin.atm.domain.client.impl.Premium;
import com.example.ferin.atm.domain.client.impl.Standard;

public abstract class ClientFactoryImpl {

    public static ClientFactory getClientType(String type)
    {
        if(type.equalsIgnoreCase("business"))
            return new Business();
        if(type.equalsIgnoreCase("premium"))
            return new Premium();
        if(type.equalsIgnoreCase("standard"))
            return new Standard();
        else
            return null;
    }

}
