package com.example.ferin.atm.domain.client;

import java.io.Serializable;

public class Client implements Serializable{

    private static Client client = null;

    private long id;
    private String idNumber;
    private String name;
    private String memberShipType;
    private String emailAddress;

    private Client(){}

    private Client(Builder builder) {
        this.idNumber = builder.idNumber;
        this.name = builder.name;
        this.memberShipType = builder.memberShipType;
        this.id = builder.id;
        this.emailAddress = builder.emailAddress;
    }

    public Client getInstance()
    {
        if(client == null)
            client = new Client();
        return client;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public long getId() {
        return id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getMembershipType() {
        return memberShipType;
    }

    public static class Builder
    {
        private String idNumber;
        private String name;
        private String memberShipType;
        private Long id;
        private String emailAddress;

        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder id(Long id)
        {
            this.id = id;
            return this;
        }

        public Builder idNumber(String value){
            this.idNumber = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder membershipType(String memberShipType){
            this.memberShipType = memberShipType;
            return this;
        }

        public Builder copy(Client client)
        {
            this.idNumber = client.idNumber;
            this.name = client.name;
            this.memberShipType = client.memberShipType;
            this.id = client.id;
            return this;
        }

        public Client build() {
            return new Client(this);
        }

    }
}
