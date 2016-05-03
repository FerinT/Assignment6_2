package com.example.ferin.atm.repository.client.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.ferin.atm.conf.database.DBConstants;
import com.example.ferin.atm.domain.client.Client;
import com.example.ferin.atm.repository.client.ClientRepository;

import java.util.Set;

/**
 * Created by Ferin on 2016-05-03.
 */
public class BusinessRepositoryImpl extends SQLiteOpenHelper implements ClientRepository{

    public static final String TABLE_NAME = "businessClient";
    private SQLiteDatabase db;

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_IDNUMBER = "idNumber";
    public static final String COLUMN_EMAIL = "email";

    public BusinessRepositoryImpl(Context context)
    {
        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATABASE_VERSION);
    }

    public void open() throws SQLException {
        db = this.getWritableDatabase();
    }

    public BusinessRepositoryImpl(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public BusinessRepositoryImpl(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public Client findById(Long aLong) {
        return null;
    }

    @Override
    public Client save(Client entity) {

        open();
        ContentValues values = new ContentValues();

        values.put(COLUMN_IDNUMBER, entity.getIdNumber());
        values.put(COLUMN_EMAIL, entity.getEmailAddress());
        values.put(COLUMN_NAME, entity.getName());

        Long id = db.insertOrThrow(TABLE_NAME, null,values);

        Client client = new Client.Builder()
                .copy(entity)
                .id(new Long(id))
                .build();

        return client;
    }

    @Override
    public Client update(Client entity) {
        return null;
    }

    @Override
    public Client delete(Client entity) {
        return null;
    }

    @Override
    public Set<Client> findAll() {
        return null;
    }

    @Override
    public int deleteAll() {
        return 0;
    }
}
