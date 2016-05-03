package com.example.ferin.atm.domain.client.impl;


import com.example.ferin.atm.domain.client.Client;
import com.example.ferin.atm.factories.client.ClientFactory;

public class Premium implements ClientFactory {

    public Client getClient(String idNumber, String name, String emailAddress) {
        Client premium = new Client.Builder()
                .idNumber(idNumber)
                .name(name)
                .membershipType("premium")
                .build();
        return premium;
    }
}
