package com.example.ferin.atm.factories.client;

import com.example.ferin.atm.domain.client.Client;

public interface ClientFactory {
    Client getClient(String idNumber, String name, String emailAddress);
}
