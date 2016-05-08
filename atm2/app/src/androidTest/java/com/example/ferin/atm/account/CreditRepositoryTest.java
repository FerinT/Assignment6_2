package com.example.ferin.atm.account;

import android.test.AndroidTestCase;

import com.example.ferin.atm.domain.account.impl.Credit;
import com.example.ferin.atm.domain.client.Client;
import com.example.ferin.atm.factories.client.ClientFactory;
import com.example.ferin.atm.factories.client.ClientFactoryImpl;
import com.example.ferin.atm.repository.account.CreditRepository;
import com.example.ferin.atm.repository.account.impl.CreditRepositoryImpl;

import junit.framework.Assert;

import java.util.Set;

/**
 * Created by Ferin on 2016-05-09.
 */
public class CreditRepositoryTest extends AndroidTestCase {

    private Long id;

    public void testCreateReadUpdateDelete() throws Exception {
        Client client = ClientFactoryImpl.getClientType("business","456", "ferin", "ferin@abc", new Long(3));

        CreditRepository creditRepository = new CreditRepositoryImpl(this.getContext());

        // CREATE
        Credit credit = new Credit.Builder()
                .accountNumber("1234")
                .balance(300)
                .limit(100)
                .pin("123")
                .client(client)
                .build();
        Credit insertedEntity = creditRepository.save(credit);
        id = insertedEntity.getId();
        Assert.assertNotNull(insertedEntity);

        // READ ALL
        Set<Credit> businessSet = creditRepository.findAll();
        Assert.assertTrue(businessSet.size() > 0);

        // READ ENTITY
        Credit entity = creditRepository.findById(id);
        Assert.assertNotNull(entity);

        // UPDATE ENTITY
        Credit updateEntity = new Credit.Builder()
                .copy(entity)
                .balance(700)
                .client(client)
                .build();
        creditRepository.update(updateEntity);
        Credit newEntity = creditRepository.findById(id);
        Assert.assertEquals(Double.parseDouble("700"), newEntity.getBalance());

        // DELETE ENTITY
        creditRepository.delete(updateEntity);
        Credit deletedEntity = creditRepository.findById(id);
        Assert.assertNull(deletedEntity);


        // DELETE ALL
        creditRepository.deleteAll();
        Set<Credit> deletedUsers = creditRepository.findAll();
        Assert.assertTrue(deletedUsers.size() == 0);
    }

}
