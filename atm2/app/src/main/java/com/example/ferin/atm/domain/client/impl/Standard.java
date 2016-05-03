package com.example.ferin.atm.domain.client.impl;

import com.example.ferin.atm.domain.client.Client;
import com.example.ferin.atm.factories.client.ClientFactory;

public class Standard implements ClientFactory {

    public Client getClient(String idNumber, String name, String emailAddress) {
        Client standard = new Client.Builder()
                .idNumber(idNumber)
                .name(name)
                .emailAddress(emailAddress)
                .membershipType("standard")
                .build();
        return standard;
    }
}
