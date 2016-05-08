package com.example.ferin.atm.client;

import android.test.AndroidTestCase;

import com.example.ferin.atm.domain.client.Client;
import com.example.ferin.atm.domain.client.impl.Business;
import com.example.ferin.atm.repository.client.BusinessRepository;
import com.example.ferin.atm.repository.client.impl.BusinessRepositoryImpl;

import junit.framework.Assert;

import java.util.Set;

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
                .build();

        Business insertedEntity = businessRepository.save(client);
        id = insertedEntity.getId();
        Assert.assertNotNull(insertedEntity);

        // READ ALL
        Set<Business> businessSet = businessRepository.findAll();
        Assert.assertTrue(businessSet.size() > 0);

        // READ ENTITY
        Business entity = businessRepository.findById(id);
        Assert.assertNotNull(entity);

        // UPDATE ENTITY
        Business updateEntity = new Business.Builder()
                .copy(entity)
                .name("taylor")
                .build();
        businessRepository.update(updateEntity);
        Business newEntity = businessRepository.findById(id);
        Assert.assertEquals("taylor", newEntity.getName());

        // DELETE ENTITY
        businessRepository.delete(updateEntity);
        Business deletedEntity = businessRepository.findById(id);
        Assert.assertNull(deletedEntity);


        // DELETE ALL
        businessRepository.deleteAll();
        Set<Business> deletedUsers = businessRepository.findAll();
        Assert.assertTrue(deletedUsers.size() == 0);


    }

    }

