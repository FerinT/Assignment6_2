package com.example.ferin.atm.client;

import android.test.AndroidTestCase;

import com.example.ferin.atm.domain.client.Client;
import com.example.ferin.atm.domain.client.impl.Business;
import com.example.ferin.atm.repository.client.BusinessRepository;
import com.example.ferin.atm.repository.client.impl.BusinessRepositoryImpl;

import junit.framework.Assert;

/**
 * Created by Ferin on 2016-05-04.
 */
public class BusinessRepositoryTest extends AndroidTestCase {

    private Long id;
    public void testCreateReadUpdateDelete() throws Exception {
        BusinessRepository businessRepository = new BusinessRepositoryImpl(this.getContext());

        // CREATE
        Business client = new Business.Builder()
                .name("ferin")
                .emailAddress("123@gmail")
                .idNumber("456")
                .membershipType("client")
                //.id( new Long(1))
                .build();

        Business insertedEntity = businessRepository.save(client);
        id = insertedEntity.getId();
        Assert.assertNotNull(insertedEntity);
    }

    }

