package com.example.ferin.atm.domain.client.impl;


import com.example.ferin.atm.domain.client.Client;
import com.example.ferin.atm.factories.client.ClientFactory;

public class Business implements ClientFactory {

    public Client getClient(String idNumber, String name, String emailAddress) {
        Client business = new Client.Builder()
                .idNumber(idNumber)
                .name(name)
                .membershipType("BusinessRepositoryImpl")
                .build();
        return business;
    }
}
